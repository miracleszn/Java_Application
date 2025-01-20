import java.util.Scanner;

public class Hypotenuse{
	
	public static double firstSide;
	public static double secondSide;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first side: ");
		firstSide = input.nextDouble();
		
		System.out.print("Enter the second side: ");
		secondSide = input.nextDouble();
		
		System.out.println("The length of the Hypotenuse is " + Hypotenuse.hypotenuseCalculations(firstSide, secondSide));
		
	}
	
	public static double hypotenuseCalculations(double side1, double side2){
		double hypotenuse = Math.hypot(side1,side2);
		return hypotenuse;
	}
}