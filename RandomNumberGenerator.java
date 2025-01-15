import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator{
	public static void main(String[] args){
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the upper limit to be generated: ");
		int upperLimit = input.nextInt();
		
		if(upperLimit == 0){
			System.out.println("The number must be greater than 0");
		} else {
			int randomNum = random.nextInt(upperLimit) + 1;
			System.out.printf("Generate Random number from 0 - %d is: %d%n",upperLimit,randomNum);
		}
		
		
	}
}