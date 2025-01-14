// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task216
public class Task216{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		if (num1 > num2)
			System.out.printf("%d is larger\n",num1);
		
		if (num2 > num1)
			System.out.printf("%d is larger\n",num2);
		
		if (num1 == num2)
			System.out.println("These numbers are equal");
		
		
		
	}
}