import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("Enter name: ");
		name = input.nextLine();
		
		System.out.print("Enter score: ")
		score = input.nextInt();
		
		int grade = score / 10;
		
		switch(grade){
			case 10: //100-90
			case 9: //89-90
				System.out.println(name + " Your grade is outstanding ");
			break;
			
			case 8: // 80-89
			case 7: // 70-79
			case 6: // 60-69
				System.out.println(name + " Your grade is Excellent ");
			break;
			
			case 5: // 50-59
				System.out.println(name + " Your grade is Good");
			break;
			
			case 4: // 40-49
				System.out.println(name + " Your grade is Average");
			break;
			
			case 3: // 30-39
			case 2: // 20-29
			case 1: // 10-19
			case 0: // 0-9
				System.out.println(name + " Your grade is very poor");
			break;
			
			default:
				System.out.print(name + " Please enter a valid score");
		}
	}
}