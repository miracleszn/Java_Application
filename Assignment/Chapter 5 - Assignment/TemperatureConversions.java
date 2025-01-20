import java.util.Scanner;

public class TemperatureConversions{
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		
		
		
		System.out.println("---1. Fahrenheit to Celsius---");
		System.out.println("---2. Celsius to Fahrenheit---");
		System.out.print("Enter Your desired convertion 1/2: ");
		int option = input.nextInt();
		
		if(option == 1){
			double temperature = TemperatureConversions.fahrenheitToCelsiusConvertion();
			System.out.printf("The temperature in celsius is %.1f", temperature);
			
		} else if(option == 2){
			double temperature = TemperatureConversions.celsiusToFahrenheitConvertion();
			System.out.printf("The temperature in fahrenheit is %.1f", temperature);
		} else {
			System.out.println("Invalid Input");
			return;
		}
				
	}
	
	public static double fahrenheitToCelsiusConvertion(){
		System.out.print("Enter the temperature in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
	}
	
	public static double celsiusToFahrenheitConvertion(){
		System.out.print("Enter the temperature in celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5.0 * celsius + 32; 
		return fahrenheit;
		
	}
	
	
}