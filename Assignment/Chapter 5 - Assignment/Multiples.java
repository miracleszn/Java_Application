import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondInteger = input.nextInt();
		
		boolean result = Multiples.isMultiple(firstInteger, secondInteger);
		
		if(result == true){
			System.out.printf("Yes! %d is the multiple of %d%n",secondInteger, firstInteger);
		} else
			System.out.printf("No! %d is not the multiple of %d%n",secondInteger, firstInteger);
	}
	
	public static boolean isMultiple(int num1, int num2){
		if(num2 % num1 == 0){
			return true;
		} else
			return false;
	}
}