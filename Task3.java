// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task3
public class Task3{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int b;
		int c;
		
		System.out.print("Enter the first integer: ");
		b = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		c = input.nextInt();
		
		
		int a = b * c;
		System.out.printf("Product is %d",a);
		
	}
}