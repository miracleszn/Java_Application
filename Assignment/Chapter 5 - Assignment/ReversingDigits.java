import java.util.Scanner;

public class ReversingDigits{
	
	public static int[] numbers = new int[4];
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 4; i++){
			System.out.print("Enter a single digit:");
			numbers[i] = input.nextInt();
		}
		ReversingDigits.reversingNumbers();
	}
	
	public static void reversingNumbers(){
		for(int i = 3; i >= 0; i--){
			System.out.print(numbers[i]);
		}
	}
}