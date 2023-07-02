package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {

    private static Connection connection;
    private static final String JDBC = "jdbc:mysql://localhost:3306/%s";
    //private static final String DB_PARAMETERS =
            //"?allowPublicKeyRetrieval=true&userSSL=false&createDatabaseIfNotExist=true&serverTimezone=UTC";
    private static final String DB_NAME = "soft_uni";
    private static final String USER_KEY = "user";
    private static final String USERNAME = "root";
    private static final String PASSWORD_KEY = "password";
    private static final String PASSWORD = "root_12345";


    public static void createConnection() throws SQLException {

        if (connection != null) {
            return;
        }

        Properties properties = new Properties();
        properties.setProperty(USER_KEY, USERNAME);
        properties.setProperty(PASSWORD_KEY, PASSWORD);

        String formattedJDBC = String.format(JDBC, DB_NAME);

        connection = DriverManager.getConnection(formattedJDBC, properties);
    }

    public static Connection getConnection() throws SQLException {

        createConnection();

        return connection;
    }
}
