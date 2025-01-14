import java.util.Scanner;

public class FindingTheLargestNumber323{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int largestNumber = 0;
		int secondLargestNumber = 0;
		int number;
		
		while(i <= 10){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if(number > largestNumber && number != secondLargestNumber)
				largestNumber = number;
			
			if(number > secondLargestNumber && number < largestNumber)
				secondLargestNumber = number;
			
			i++;
		}
		
		System.out.printf("The largest Number is %d%n",largestNumber);
		System.out.printf("The second largest Number is %d%n",secondLargestNumber);
	}
}