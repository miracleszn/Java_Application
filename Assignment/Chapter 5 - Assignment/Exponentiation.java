import java.util.Scanner;

public class Exponentiation{
	
	public static int base;
	public static int exponent;
	public static int power;
	public static int i = 1;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the base: ");
		base = input.nextInt();
		
		
		System.out.print("Enter the exponent: ");
		exponent = input.nextInt();
		
		if(base <= 0 && exponent <= 0){
			System.out.print("Enter a valid base or exponent");
		} else
			Exponentiation.integerPower(base, exponent);
	}
	
	public static void integerPower(int x, int y){
			power = x;
			while(i <= y-1){
				power = power * x;
				i++;
			}
			System.out.printf("%d raised to the power of %d is %d", base,exponent,power);
		}
}