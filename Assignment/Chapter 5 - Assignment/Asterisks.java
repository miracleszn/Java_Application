import java.util.Scanner;

public class Asterisks{
	
	public static int n;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of side: ");
		n = input.nextInt();
		
		Asterisks.squareOfAsterisks(n);
	}
	
	public static void squareOfAsterisks(int k){
		int i = 1;
		String asterisk = "*";
		
		
		while(i <= k){
			System.out.println(asterisk.repeat(k));
			i++;
		}
	}
	
	
}
			