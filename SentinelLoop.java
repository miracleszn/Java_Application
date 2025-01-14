import java.util.Scanner;

public class SentinelLoop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum (Enter -1 to stop)");
		
		int sum = 0;
		int number;
		
		// Sentinel value is -1
		while (true) {
			System.out.print("Enter number: ");
			number= input.nextInt();
			
			if (number == -1) {
				break;
			}
			
			sum += number;
		}
		
		
		System.out.printf("The total sum is: %d", sum);
	}
}