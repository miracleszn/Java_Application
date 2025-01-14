import java.util.Scanner;

public class GasMileage{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		int milesDriven;
		int gallonsUsed;
		double totalMpgForTrip = 0.00;
	
		while(true){
		
		System.out.print("Enter the number of Miles Driven(Enetr -1 to end): ");
		milesDriven = input.nextInt();
		
		if(milesDriven == -1)
			break;
		
		System.out.print("Enter the number of Gallons Used: ");
		gallonsUsed = input.nextInt();
		
		double milesPerGallon = (double) milesDriven / gallonsUsed;
		System.out.printf("The MPG of this trip is %.2f%n",milesPerGallon);
		
		totalMpgForTrip =+ milesPerGallon;
		
		}
		
		System.out.printf("The combined MPG for all the trips is: %.2f", totalMpgForTrip);
	}
}