package WorkingWithAbstraction.pointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public  boolean Contains(Point point) {
        boolean isXInside = point.getX() >= this.bottomLeft.getX() && point.getX() <= this.topRight.getX();
        boolean isYInside = point.getY() >= this.bottomLeft.getY() && point.getY() <= this.topRight.getY();


        return isXInside && isYInside;
    }
}
