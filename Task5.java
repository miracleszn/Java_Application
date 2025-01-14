// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task5
public class Task5{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.printf("The Sum is %d\n",sum);
		
		int product = num1 * num2;
		System.out.printf("The Product is %d\n",product);
		
		int difference = num1 - num2;
		System.out.printf("The Difference is %d\n",difference);
		
		int quotient = num1 / num2;
		System.out.printf("The Quotient is %d",quotient);
		
		
		
	}
}