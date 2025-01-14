import java.util.Scanner;

public class ForLoop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int score;
		int sumOfScore = 0;
		double average;
		
		for(int i = 1; i<=10; i++){
			System.out.print("Enter score: ");
			score = input.nextInt();
			
			sumOfScore = sumOfScore + score; // Or sumOfScore += score
		}
		
		average = (double)sumOfScore/10;
		System.out.printf("The score average is %.2f", average);
		
	}
}