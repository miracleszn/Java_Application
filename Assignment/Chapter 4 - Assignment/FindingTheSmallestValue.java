import java.util.Scanner;

public class FindingTheSmallestValue{
	public static void main(String[] args){
		
		int firstNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number which will also serve the number of inputs");
		firstNumber = input.nextInt();
		int smallestInteger = firstNumber;
		
		for(int i = 1; i <= firstNumber; i++){
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if(number < smallestInteger){
				smallestInteger = number;
				System.out.printf("The current smallest number is %d%n",smallestInteger);
			}
		}
		
		System.out.printf("The smallest number is %d%n",smallestInteger);
	}
}