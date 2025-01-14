import java.util.Scanner;

public class Factorials{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter a postive number");
		number = input.nextInt();
		System.out.println("The factorial of " + number + " is " + Factorials.calculatingFactorial(number));
		
	}
	
	public static int calculatingFactorial(int n){
		if(n < 1){
			System.out.println("You can't enter negetive values");
		} else if(n == 1 || n == 0){
			System.out.println("The factorial is 0");
		} else {
		return n * (n - 1);
		}
	}
}