import java.util.Scanner;

public class FindingTheLargestNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number;
		int largest = 0;
		
		while(counter <= 10){
		System.out.print("Enter the units sold by each salesperson: ");
		number = input.nextInt();
		
		if (number > largest)
			largest = number;
		
		counter++;
		}
		System.out.printf("The winner of the sales contest is the salesperson which score is %d",largest);
	}
}