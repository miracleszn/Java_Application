import java.util.Scanner;

public class ProductOfOddInteger{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number;
        
		
		while(true){
		
		System.out.print("Enter a number from 1 to 15: ");
		number = input.nextInt();
		
		
			if(number>=1 && number < 16){
				if (number % 2 == 1){
					product = int product * number; 
					continue;
				}
			} else {
				System.out.println("Enetr a valid input");
				break;
			}
		}
		
		System.out.printf("The product of all odd number is %d%n",product);
		
	}
}