import java.util.Scanner;

public class ValidatingUserInput{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		
		do {
			
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if(number != 2 || number != 1)
				System.out.println("Please enter the correct value");
			
			if(number == 1)
				break;
			
			if(number == 2)
				break;
			
		} while(true);
		
		
		System.out.println("Hurray, you got the number");
	}
}