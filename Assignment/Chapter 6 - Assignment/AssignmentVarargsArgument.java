import java.util.Scanner;

public class AssignmentVarargsArgument{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter amount of numbers you wish to enter: ");
		int size = input.nextInt();
		
		int i = 0;
		int[] numbers = new int[size];
		
		
		while (true) {
			System.out.print("Enter a number (Enter -1 to stop) : ");
			numbers[i] = input.nextInt();
			System.out.println(" ");
			
			
			if (i == size-1){
				System.out.println("You have reached your desired limit!!!")
				break;
			}
			
			if (numbers[i] == -1) {
				break;
			}
			
			i++;
		}
		
		System.out.println(AssignmentVarargsArgument.add(numbers));
	}
	
	
	public static int add(int...numbers){
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		return sum;
	}
} 