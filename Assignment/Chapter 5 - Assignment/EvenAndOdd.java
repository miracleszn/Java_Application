import java.util.Scanner;

public class EvenAndOdd{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter the number: ");
			int integer = input.nextInt();
		
			boolean result = EvenAndOdd.isEven(integer);
			
			if(result == true){
				System.out.println("Yes! The Integer is even!");
			} else {
				System.out.println("No! The Integer is odd!");
			}
			
		}
	}
	
	public static boolean isEven(int num){
		if(num % 2 == 0){
			return true;
		} else
			return false;
	}
}