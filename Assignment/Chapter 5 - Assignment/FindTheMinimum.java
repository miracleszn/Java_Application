import java.util.Scanner;

public class FindTheMinimum{
	
	public static double firstNum;
	public static double secondNum;
	public static double thirdNum;
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double firstNum = input.nextDouble();
		
		System.out.print("Enter the second number: ");
		double secondNum = input.nextDouble();
		
		System.out.print("Enter the third number: ");
		double thirdNum = input.nextDouble();
		
		FindTheMinimum.minimum3(firstNum, secondNum, thirdNum);
	}
	
	public static void minimum3(double num1, double num2, double num3){
		double minimumOfSecondAndThirdNumber = Math.min(num2, num3);
		double minimumOfAllNumbers = Math.min(num1, minimumOfSecondAndThirdNumber);
		System.out.printf("The smallest value of the three number is %.2f", minimumOfAllNumbers);
	}
}