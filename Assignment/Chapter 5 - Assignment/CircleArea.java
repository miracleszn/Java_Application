import java.util.Scanner;

public class CircleArea{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		CircleArea.circleArea(radius);
		
	}
	
	public static void circleArea(double r){
		double area = Math.PI * r * r;
		System.out.printf("The area of the circle is %.2f", area);
	}
}