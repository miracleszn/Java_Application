import java.util.Scanner;

public class EnhancedForLoopManipulation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int pro = 1;
		int[] numbers = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.print("Enter number: ");
			numbers[i] = input.nextInt();
			
			pro *= numbers[i];
		}
		System.out.printf("The product of all the numbers is %d", pro);
	}
}