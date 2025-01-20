import java.util.Scanner;

public class RoundedNumber1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double decimalNumber;
		int roundedNumber;
		
		System.out.print("Enter a decimal number: ");
		decimalNumber = input.nextDouble();
		
		roundedNumber = (int) Math.floor(decimalNumber);
		
		System.out.printf("The Original number is %.2f%n", decimalNumber);
		System.out.printf("The Rounded number is %d", roundedNumber);
	}
	
}