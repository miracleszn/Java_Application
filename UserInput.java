// you import before creating the class
import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
	// we used the variable scan to represent the Scanner class
		Scanner scan = new Scanner(System.in); // system.in takes in, just like the way system.out prints out
		
		int num1;
		int num2;
		int num3;
		String name;
		
		System.out.print("Enter first number: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter Second number: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter Third number: ");
		num3 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter first name: ");
		name = scan.nextLine();
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("%s The sum of the number is %d",name,sum);
	}
}
