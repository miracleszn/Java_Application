import java.util.Scanner;

public class GreatestCommonDivisor{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();
		
		int result = GreatestCommonDivisor.gcd(firstInteger, secondInteger);
		
		System.out.printf("The GCD of %d and %d is %d", firstInteger, secondInteger, result);
	}
	
	public static int gcd(int num1, int num2){
		while(num2 != 0){
			int i = num2;
			num2 = num1 % num2;
			num1 = i;
		}
		return num1;
	}
}