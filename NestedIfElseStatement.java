import java.util.Scanner;

public class NestedIfElseStatement{
	public static void main(String[] args) {
		// this atatement allows you to test multiplr condition by placing a if statment inside an if else statement
		
		Scanner input = new Scanner(System.in);
		
		int score;
		String name;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Ënter your Score: ");
		score = input.nextInt();
		
		if(score >= 90)
			System.out.println(name + " your grade is outstanding");
		else if(score >= 75)
			System.out.println(name + " your grade is Excellent");
		else if(score >= 55)
			System.out.println(name + " your grade is Good");
		else if(score >= 45)
			System.out.println(name + " your grade is Average");
		else 
			System.out.println(name + " your grade is very Poor");
	}
}
