// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task2
public class Task2{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		int result = x * y * z;
		System.out.printf("Product is %d",result);
		
	}
}