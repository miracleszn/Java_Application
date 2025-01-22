import java.util.Scanner;

public class ClassWorkArrayManipulation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int sumOfSecondToSixth = 0;
		int sumOfseventhToNineth = 0;
		int i;
		
		for(i = 0; i < 10; i++){
			System.out.print("Enter number: ");
			numbers[i] = input.nextInt();
			
			if(i > 0 && i < 6){
				sumOfSecondToSixth = sumOfSecondToSixth + numbers[i];
			} else if(i > 5 && i < 9){
				sumOfseventhToNineth = sumOfseventhToNineth + numbers[i];
			} else
				continue;
		}
		
		int result = sumOfseventhToNineth - sumOfSecondToSixth;
		
		System.out.printf("The esult is %d", result);
	}
}