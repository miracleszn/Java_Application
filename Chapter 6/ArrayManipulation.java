import java.util.Scanner;

public class ArrayManipulation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter number: ");
			numbers[i] = input.nextInt();
			
			sum = sum + numbers[i];
		}
		
		System.out.printf("The sum of all the numbers entered is %d", sum);
	}
}