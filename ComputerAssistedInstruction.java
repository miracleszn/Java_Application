import java.util.Scanner;
import java.security.SecureRandom;


public class ComputerAssistedInstruction{
	
	public static 
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void prompt(){
			System.out.printf("How much is %d times %d?", num1, num2);
			answer = input.nextInt();
			return answer;
	}
	
	public static int generatingNumber(){
		int num1 = randomNumbers.nextInt(10);
		int num2 = randomNumbers.nextInt(10);
		
		sum =  num1 * num2;
	}
}