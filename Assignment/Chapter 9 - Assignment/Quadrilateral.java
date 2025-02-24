package chapter_9_Assignment;

public class Quadrilateral {
    
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    // Getters for points (if needed)
    public Point getPoint1() { return point1; }
    public Point getPoint2() { return point2; }
    public Point getPoint3() { return point3; }
    public Point getPoint4() { return point4; }

    @Override
    public String toString() {
        return "Quadrilateral: " + point1 + ", " + point2 + ", " + point3 + ", " + point4;
    }
    
}
