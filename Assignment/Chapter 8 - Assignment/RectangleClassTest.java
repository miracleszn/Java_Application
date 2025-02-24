import java.util.Scanner;

public class RectangleClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of the Rectangle in cm: ");
        double length = input.nextDouble();
        System.out.print("Enter the Width of the Rectangle in cm: ");
        double width = input.nextDouble();

        RectangleClass rC = new RectangleClass(length, width);

        System.out.println("The Perimeter of the Rectangle is " + rC.perimeter(length, width) + "cm");
        System.out.println("The Area of the Rectangle is " + rC.area(length, width) + "cm");
    }
}