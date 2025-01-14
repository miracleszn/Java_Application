import java.util.Scanner;

public class SalaryCalculator{
	
	public static String employeeName;
	public static double hourlyRate;
	public static int hoursWorked;
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		while(i <= 3){
		
		System.out.print("Enter your name: ");
		employeeName = input.nextLine();
		System.out.println(" ");
		
		System.out.print("Enter your hourly rate: ");
		hourlyRate = input.nextDouble();
		System.out.println(" ");
		
		System.out.print("Enter the amount of hours worked last week: ");
		hoursWorked = input.nextInt();
		
		SalaryCalculator.calculatePay(employeeName,hourlyRate,hoursWorked);
		i++;
		}
	}
	
	public static void calculatePay(String employeeName, double hourlyRate, int hoursWorked){
		if (hoursWorked > 40){
			double overTime =  hoursWorked - 40;
			double overTimePay = overTime * hourlyRate/2;
			double grossPay =  hoursWorked * hourlyRate;
			System.out.printf("%s you worked an additional %.0f hour and your total pay for the week is %f%n",employeeName,overTime,grossPay);
			
		} 
		if (hoursWorked <= 40) {
			double grossPay =  hoursWorked * hourlyRate;
			System.out.printf("%s your pay for the week is %d%n",employeeName,grossPay);
		}
	}
}