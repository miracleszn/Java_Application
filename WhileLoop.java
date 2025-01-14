import java.util.Scanner;

public class WhileLoop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int score;
		int sumOfScore = 0;
		double average;
		int i = 1;
		
		while(i<=10){
			System.out.print("Enter score: ");
			score = input.nextInt();
			
			sumOfScore = sumOfScore + score; // Or sumOfScore += score
			i++;
		}
		
		average = (double)sumOfScore/10;
		System.out.printf("The score average is %.2f", average);
		
	}
}