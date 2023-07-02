package orm;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EntityManager<E> implements DBContext<E> {

    private static final String CREATE_TABLE_FORMAT = "CREATE TABLE IF NOT EXISTS %s (id INT PRIMARY KEY AUTO_INCREMENT, %s);";
    private static final String DELETE_FROM_TABLE_FORMAT = "DELETE FROM %s WHERE %s";
    private static final String SELECT_FROM_TABLE_FORMAT = "SELECT * FROM %s %s";
    private static final String SELECT_FROM_TABLE_LIMIT_1_FORMAT = "SELECT * FROM %s %s LIMIT 1";
    private static final String ALTER_TABLE_FORMAT = "ALTER TABLE %s %s";
    private static final String ADD_COLUMN_FORMAT = "ADD COLUMN %s %s";
    private static final String GET_ALL_COLUMNS_NAMES =
            "SELECT `COLUMN_NAME` " +
                    "FROM `INFORMATION_SCHEMA`.`COLUMNS` " +
                    "WHERE `TABLE_SCHEMA` = 'soft_uni' " +
                    "  AND `COLUMN_NAME` != 'id' " +
                    "  AND `TABLE_NAME` = ?;";

    private static final String CREATE_VALUE_FORMAT = "%s %s";
    private static final String WHERE_ID_FORMAT = "id = %d";
    private static final String WHERE_FORMAT = "WHERE %s";
    private static final String VALUES_SPLITTER = ",\\s+";
    private static final String VALUES_FORMAT = "'%s'";

    private static final String INT = "INT";
    private static final String VARCHAR = "VARCHAR(50) NOT NULL";
    private static final String DECIMAL = "DECIMAL(19, 2) NOT NULL";

    private final Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void doCreate(Class<E> entity) throws SQLException {

        final String tableName = this.getTableName(entity);

        final List<KeyValuePair> fieldsWithTypes = this.getAllFieldsAndTypesInKeyValuePairs(entity);

        final String fieldsWithTypesFormatted = fieldsWithTypes
                .stream()
                .map(keyValuePair -> String.format(CREATE_VALUE_FORMAT, keyValuePair.key, keyValuePair.value))
                .collect(Collectors.joining(", "));

        final PreparedStatement stmt = connection.prepareStatement
                (String.format(CREATE_TABLE_FORMAT, tableName, fieldsWithTypesFormatted));

        stmt.execute();

    }

    private List<KeyValuePair> getAllFieldsAndTypesInKeyValuePairs(Class<E> entity) {

        return getAllFieldsWithoutID(entity)
                .stream()
                .map(f -> new KeyValuePair(this.getSQLColumnName(f), this.getSQLType(f.getType())))
                .toList();
    }

    private List<Field> getAllFieldsWithoutID(Class<E> entity) {

        return Arrays.stream(entity.getDeclaredFields())
                .filter(f -> !f.isAnnotationPresent(Id.class) && f.isAnnotationPresent(Column.class))
                .toList();
    }

    private String getSQLType(Class<?> type) {

        if (type == Integer.class || type == int.class) {
            return INT;
        } else if (type == Double.class || type == double.class) {
            return DECIMAL;
        } else {
            return VARCHAR;
        }
    }

    private String getSQLColumnName(Field field) {

        return field.getAnnotationsByType(Column.class)[0].name();
    }

    @Override
    public void doAlter(Class<E> entity) throws SQLException {

        final String tableName = this.getTableName(entity);

        final String columnStatementForNewFields = addColumnStatementForNewFields(entity, tableName);

        final String alterQuery = String.format(ALTER_TABLE_FORMAT, tableName, columnStatementForNewFields);

        PreparedStatement alterTableStatement = connection.prepareStatement(alterQuery);

        alterTableStatement.execute();
    }

    private String addColumnStatementForNewFields(Class<E> entity, String tableName) throws SQLException {

        final Set<String> sqlColumns = getSQLColumnNames(entity, tableName);
        final List<Field> allFieldsWithoutID = getAllFieldsWithoutID(entity);

        List<String> newFieldsStatement = new ArrayList<>();

        for (Field field : allFieldsWithoutID) {

            final String fieldName = getSQLColumnName(field);

            if (sqlColumns.contains(fieldName)) {
                continue;
            }

            final String sqlType = getSQLType(field.getType());

            String addStatement = String.format(ADD_COLUMN_FORMAT, fieldName, sqlType);

            newFieldsStatement.add(addStatement);
        }

        return String.join(", ", newFieldsStatement);
    }

    private Set<String> getSQLColumnNames(Class<E> entity, String tableName) throws SQLException {

        Set<String> allFields = new HashSet<>();

        final PreparedStatement getAllFieldsStatement = connection.prepareStatement(GET_ALL_COLUMNS_NAMES);

        getAllFieldsStatement.setString(1, tableName);

        final ResultSet resultSet = getAllFieldsStatement.executeQuery();

        while (resultSet.next()) {

            allFields.add(resultSet.getString(1));
        }

        return allFields;
    }

    @Override
    public boolean persist(E entity) throws SQLException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException, InstantiationException {

        String tableName = this.getTableName(entity.getClass());
        String columnList = this.getDBColumnsWithoutID(entity);
        String valuesList = this.getValuesWithoutID(entity);
        Long primaryKey = this.getId(entity);

        if (primaryKey == null || primaryKey <= 0) {
            return this.doInsert(tableName, columnList, valuesList);
        }

        return this.doUpdate(entity, tableName, columnList, valuesList, primaryKey);
    }

    @Override
    public boolean delete(E entity) throws IllegalAccessException, SQLException {

        return this.delete(entity, null);
    }

    @Override
    public boolean delete(E entity, String where) throws IllegalAccessException, SQLException {

        final String tableName = this.getTableName(entity.getClass());
        Long primaryKey = this.getId(entity);

        String query = String.format(DELETE_FROM_TABLE_FORMAT, tableName,
                String.format(where == null
                        ? String.format(WHERE_ID_FORMAT, primaryKey)
                        : where));

        return this.connection.prepareStatement(query).execute();
    }

    @Override
    public Iterable<E> find(Class<E> entityType) throws SQLException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {

        return find(entityType, null);
    }

    @Override
    public Iterable<E> find(Class<E> entityType, String where) throws SQLException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {

        String tableName = this.getTableName(entityType);

        String query = String.format(SELECT_FROM_TABLE_FORMAT, tableName,
                String.format(where == null ? "" : WHERE_FORMAT, where));

        ResultSet resultSet = this.connection.prepareStatement(query).executeQuery();

        List<E> result = new ArrayList<>();

        E entity = this.createEntity(entityType, resultSet);

        while (entity != null) {

            result.add(entity);

            entity = this.createEntity(entityType, resultSet);

        }

        return result;
    }

    @Override
    public E findFirst(Class<E> entityType) throws SQLException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {

        return findFirst(entityType, null);
    }

    @Override
    public E findFirst(Class<E> entityType, String where) throws SQLException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {

        String tableName = this.getTableName(entityType);

        String query = String.format(SELECT_FROM_TABLE_LIMIT_1_FORMAT, tableName,
                String.format(where == null ? "" : WHERE_FORMAT, where));

        ResultSet resultSet = this.connection.prepareStatement(query).executeQuery();

        return this.createEntity(entityType, resultSet);
    }

    private String getTableName(Class<?> clazz) {

        Entity annotation = clazz.getAnnotation(Entity.class);

        if (annotation == null) {
            throw new ORMException("Provided class does not have entity annotation!");
        }

        return annotation.name();
    }

    private String getDBColumnsWithoutID(E entity) {

        return Arrays.stream(entity
                        .getClass()
                        .getDeclaredFields())
                .filter(e -> e.getAnnotation(Column.class) != null)
                .map(e -> e.getAnnotation(Column.class).name())
                .collect(Collectors.joining(", "));
    }

    private String getValuesWithoutID(E entity) throws IllegalAccessException {

        Field[] declaredFields = entity.getClass().getDeclaredFields();

        List<String> result = new ArrayList<>();

        for (Field declaredField : declaredFields) {

            if (declaredField.getAnnotation(Column.class) == null) {
                continue;
            }

            declaredField.setAccessible(true);

            Object value = declaredField.get(entity);

            result.add(String.format(VALUES_FORMAT, value.toString()));
        }

        return String.join(", ", result);
    }

    private boolean doInsert(String tableName, String columnList, String valuesList) throws SQLException {

        String query = String.format("INSERT INTO %s (%s) VALUES (%s)", tableName, columnList, valuesList);

        return this.connection.prepareStatement(query).execute();
    }

    private boolean doUpdate(E entity, String tableName, String columnList, String valuesList, Long primaryKey)
            throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String where = String.format("id = %d", primaryKey);

        Object entityObject = this.findFirst((Class<E>) entity.getClass(), where);

        String valuesFromTable = this.getValuesWithoutID((E) entityObject);

        String query = "";

        if (!valuesList.equals(valuesFromTable)) {

            StringBuilder setBuilderForValues = new StringBuilder();
            setBuilderForValues.append("SET ");

            String[] columnsName = columnList.split(VALUES_SPLITTER);
            String[] oldTableValues = valuesFromTable.split(VALUES_SPLITTER);
            String[] newTableValues = valuesList.split(VALUES_SPLITTER);

            for (int i = 0; i < oldTableValues.length; i++) {

                if (!newTableValues[i].equals(oldTableValues[i])) {

                    setBuilderForValues.append(columnsName[i])
                            .append(" = ")
                            .append(newTableValues[i])
                            .append(", ");
                }
            }

            int deleteIndex = setBuilderForValues.lastIndexOf(", ");
            setBuilderForValues.delete(deleteIndex, deleteIndex + 2);

            query = String.format("UPDATE %s %s WHERE %s;", tableName, setBuilderForValues, where);
        }

        if (query.isEmpty()) {
            return false;
        }

        return this.connection.prepareStatement(query).execute();
    }

    private Long getId(E entity) throws IllegalAccessException {

        Field primaryKey = Arrays.stream(entity
                        .getClass()
                        .getDeclaredFields())
                .filter(e -> e.isAnnotationPresent(Id.class))
                .findFirst()
                .orElseThrow(()
                        -> new ORMException(
                        String.format("%s does not have primary key!", entity.getClass().getSimpleName())));

        primaryKey.setAccessible(true);

        return (long) primaryKey.get(entity);
    }

    private E createEntity(Class<E> entityType, ResultSet resultSet) throws SQLException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        if (!resultSet.next()) {
            return null;
        }

        E entity = entityType.getDeclaredConstructor().newInstance();

        Field[] declaredFields = entityType.getDeclaredFields();

        for (Field declaredField : declaredFields) {

            if (!declaredField.isAnnotationPresent(Column.class)
                    && !declaredField.isAnnotationPresent(Id.class)) {
                continue;
            }

            Column columnAnnotation = declaredField.getAnnotation(Column.class);

            String columnName = columnAnnotation != null
                    ? columnAnnotation.name()
                    : declaredField.getName();

            String value = resultSet.getString(columnName);

            entity = this.fillData(entity, declaredField, value);
        }

        return entity;
    }

    private E fillData(E entity, Field field, String value) throws IllegalAccessException {

        field.setAccessible(true);

        if (field.getType() == long.class || field.getType() == Long.class) {

            field.setLong(entity, Long.parseLong(value));

        } else if (field.getType() == int.class || field.getType() == Integer.class) {

            if (value == null) {
                value = "0";
            }

            field.setInt(entity, Integer.parseInt(value));

        } else if (field.getType() == double.class || field.getType() == Double.class) {

            field.setDouble(entity, Double.parseDouble(value));

        } else if (field.getType() == LocalDate.class) {

            field.set(entity, LocalDate.parse(value));

        } else if (field.getType() == String.class) {

            if (value == null) {
                value = "0.00";
            }

            field.set(entity, value);

        } else {

            throw new ORMException(String.format("Unsupported type %s", field.getType()));
        }

        return entity;
    }

    private List<KeyValuePair> getKeyValuePairs(E entity) {

        final Class<?> clazz = entity.getClass();

        return Arrays.stream(clazz.getDeclaredFields())
                .filter(f -> !f.isAnnotationPresent(Id.class) && f.isAnnotationPresent(Column.class))
                .map(f -> new KeyValuePair(f.getAnnotationsByType(Column.class)[0].name(),
                        mapFieldsToGivenType(f, entity)))
                .toList();
    }

    private String mapFieldsToGivenType(Field field, E entity) {

        field.setAccessible(true);

        Object o = null;

        try {
            o = field.get(entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return o instanceof String || o instanceof LocalDate
                ? "'" + o + "'"
                : Objects.requireNonNull(o).toString();
    }

    private record KeyValuePair(String key, String value) {
    }
}
