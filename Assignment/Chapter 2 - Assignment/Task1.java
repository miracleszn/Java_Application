// we imported a class that will help take input
import java.util.Scanner; 

//Created a class called Task
public class Task1{
	public static void main(String[] args) {
		
		// i used the variable scan to represent the scanner
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("This is a java program");
		System.out.printf("%s%n%s%n", "This is a Java", "program");
		
		System.out.print("Enter a whole a nuumber ");
		number = input.nextInt();
		
		if (number != 7)
			System.out.println("The variable number is not equal to 7");		
	}
}