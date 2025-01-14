import java.util.Scanner;

public class Constant{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double area;
		double radius;
		double number;
		
		System.out.print("Enter the radius: ");
		number = input.nextInt();
		
		radius = Math.pow(number, 2);
		
		area = Constant.pie() * radius;
		System.out.println("The area of the circle is: " + area);
		
	}
	
	public static double pie(){
		double thePi;
		thePi = 3.14159;
		return thePi;
	}
}