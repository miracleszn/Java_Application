package chapter_9_Assignment;

public class QuadrilateralInheritanceHierarchy {
    
    public static void main(String[] args) {
        // Create Point objects
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        // Create Quadrilateral object
        Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
        System.out.println(quad);

        // Create Trapezoid object
        Trapezoid trap = new Trapezoid(p1, p2, p3, p4);
        System.out.println(trap + ", Area: " + trap.getArea());

        // Create Parallelogram object
        Parallelogram para = new Parallelogram(p1, p2, p3, p4);
        System.out.println(para + ", Area: " + para.getArea());

        // Create Rectangle object
        Rectangle rect = new Rectangle(p1, p2, p3, p4);
        System.out.println(rect + ", Area: " + rect.getArea());

        // Create Square object
        Square square = new Square(p1, p2, p3, p4);
        System.out.println(square + ", Area: " + square.getArea());
    }
    
}
