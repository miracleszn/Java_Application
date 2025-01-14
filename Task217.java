// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task217
public class Task217{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("The Sum is %d\n",sum);
		
		int average = sum / 3;
		System.out.printf("The Average is %d\n",average);
		
		int product = num1 * num2 * num3;
		System.out.printf("The Product is %d\n",product);
		
		if (num1 > num2 && num1 > num3)
			System.out.printf("%d is larger\n", num1);
		
		if (num2 > num1 && num2 > num3)
			System.out.printf("%d is larger\n", num2);
		
		if (num3 > num1 && num3 > num2)
			System.out.printf("%d is larger\n", num3);
		
		// finding the smallest integer
		if (num1 < num2 && num1 < num3)
			System.out.printf("%d is Smaller\n", num1);
		
		if (num2 < num1 && num2 < num3)
			System.out.printf("%d is Smaller\n", num2);
		
		if (num3 < num1 && num3 < num1)
			System.out.printf("%d is Smaller\n", num3);
		
	}
}