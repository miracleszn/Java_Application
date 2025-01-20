import java.util.Scanner;

public class ParkingCharges{
	
	public static int hours;
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the hours you parked yesterday: ");
		hours = input.nextInt();

		ParkingCharges.parkingCalculator();
		
	}
	
	public static void parkingCalculator(){
		
		int minimumHours = 3; // this is the minimum hours
		double minimumHoursCharge = 2.00; // this is the standard minimun charge for minimumHours
		int additionalHours; // this is for the extra hours to the minimumHours
		double additionalChargePerHour = 0.50; // this is the standard charge for extra hours
		double totalAdditionalCharge; // this is gotten by multiplying the additionalChargePerHour by additionalHours
		double totalCharge;
		
		
		
		if(hours <= minimumHours){
			System.out.printf("Your Parking Charge for %d is $2.00", hours);
		} else if(hours > minimumHours){
			additionalHours = hours - minimumHours;
			totalAdditionalCharge = additionalHours * additionalChargePerHour;
			totalCharge = totalAdditionalCharge + minimumHoursCharge;
			System.out.printf("Your Parking charge for %d is $%.2f", hours, totalCharge);
		}
	}
}