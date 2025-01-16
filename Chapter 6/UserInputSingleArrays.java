import java.util.Scanner;

public class UserInputSingleArrays{
	public static void main (String[] args){
		Scanner input  = new Scanner(System.in);
		String[] names = new String[5];
		
		for(int i = 0; i < 5; i++){
			
			
			System.out.print("Enter name: ");
			names[i] = input.nextLine();
		}
		
		for(int i = 0; i < 5; i++){
			
			System.out.printf("Element at index %d = %s%n", i, names[i]);
		}
	}
}