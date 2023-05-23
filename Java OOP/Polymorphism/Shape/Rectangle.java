package Shape;

public abstract class Rectangle extends Shape {
    private double height;
    private double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
