package Shape;

public abstract class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public final double getRadius() {
        return radius;
    }


}
