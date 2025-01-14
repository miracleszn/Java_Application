// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task225
public class Task225{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.printf("%d is an odd number",number);
		else
			System.out.printf("%d is an even number",number);

	}
}