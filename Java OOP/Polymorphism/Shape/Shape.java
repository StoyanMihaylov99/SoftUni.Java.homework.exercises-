package Shape;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();


    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }
}
