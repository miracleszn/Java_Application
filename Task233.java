import java.util.Scanner;

public class Task233{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double weightInPounds;
		double heightInInches;
		double bodyMassIndex;
		
		System.out.print("Enter your weight in pounds: ");
		weightInPounds = input.nextDouble();
		
		System.out.print("Enter your height in inches: ");
		heightInInches = input.nextDouble();
		
		bodyMassIndex = weightInPounds * 703 / heightInInches * heightInInches;
		
		if(bodyMassIndex < 18.5)
			System.out.println("You are underweight");
		else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
			System.out.println("You are normal");
		else if(bodyMassIndex > 24.9 && bodyMassIndex <= 29.9)
			System.out.println("You are overweight");
		else
			System.out.println("You are obese");
		
	}
}