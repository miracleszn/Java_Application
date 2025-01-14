import java.util.Scanner;

public class Task232{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int number;
		int positive = 0;
		int negetive = 0;
		int zero = 0;
		
		while(i <= 5){
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number>0){
			positive++;
			System.out.println("This is a positive number");
		} else if(number<0){
			negetive++;
			System.out.println("This is a negetive number");
		} else {
			zero++;
			System.out.println("The number is zero");
		}
		i++;
		}
		
		System.out.println("The number of postitve numbers is: " + positive);
		System.out.println("The number of negetive numbers is: " + negetive);
		System.out.println("The number of zero is: " + zero);
	}
}