import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("********Menu********");
		System.out.println("Enter 1 to calculate perimeter of a square");
		System.out.println("Enter 2 to calculate perimeter of a rectangle");
		
		int option = input.nextInt();
		
		switch(option){
			case 1:
				System.out.print("Enter the length of the Square");
				int length = input.nextInt();
				MethodOverloading.shape(length);
			break;
			
			case 2:
				System.out.print("Enter the length of the Rectangle");
				length = input.nextInt();
				
				System.out.print("Enter the breath of the Rectangle");
				int breath = input.nextInt();
				
				MethodOverloading.shape(length , breath);
			break;
			
			default:
			System.out.println("Invalid Input");
		}
		
		
	}
	
	
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		System.out.printf("The perimeter of the square is %d", perimeterOfSquare);
	}
	
	
	
	public static void shape(int length, int breath){
		int perimeterOfRect = length * breath;
		
		System.out.printf("The perimeter of rectangle is %d", perimeterOfRect);
	}
}
