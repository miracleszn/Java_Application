import java.util.Scanner;

public class TaxPlanAlternative{
	
	public static Scanner input = new Scanner(System.in);
	public static double fairTax = 0.23;
	public static double taxForHousing;
	public static double taxForFood;
	public static double taxForClothing;
	public static double taxForTransportation;
	public static double taxForEducation;
	public static double taxForHealthCare;
	public static double taxForVacation;
	
	
	
	
	
	
	public static void main(String[] args){
		
		
		
		
		TaxPlanAlternative.housingTax();
		TaxPlanAlternative.foodTax();
		TaxPlanAlternative.clothingTax();
		TaxPlanAlternative.transportationTax();
		TaxPlanAlternative.educationTax();
		TaxPlanAlternative.healthCareTax();
		TaxPlanAlternative.vacationTax();
		
		
		System.out.printf("%-10s %-20s%n%n", "Expenses", "FairTax(23%)");
		
		System.out.printf("%-10s %-20.2f%n", "Housing", taxForHousing);
		System.out.printf("%-10s %-20.2f%n", "Food", taxForFood);
		System.out.printf("%-10s %-20.2f%n", "Clothing", taxForClothing);
		System.out.printf("%-10s %-20.2f%n", "Transport", taxForTransportation);
		System.out.printf("%-10s %-20.2f%n", "Education", taxForEducation);
		System.out.printf("%-10s %-20.2f%n", "HealthCare", taxForHealthCare);
		System.out.printf("%-10s %-20.2f%n", "Vacation", taxForVacation);
	}
	
	public static void housingTax(){
		System.out.print("Enter your expenses on housing: ");
		double housingExpenses = input.nextDouble();
		taxForHousing = housingExpenses * fairTax;
	}
	
	public static void foodTax(){
		System.out.print("Enter your expenses on food: ");
		double foodExpenses = input.nextDouble();
		taxForFood = foodExpenses * fairTax;
	}
	
	public static void clothingTax(){
		System.out.print("Enter your expenses on clothing: ");
		double clothingExpenses = input.nextDouble();
		taxForClothing = clothingExpenses * fairTax;
	}
	
	public static void transportationTax(){
		System.out.print("Enter your expenses on transportation: ");
		double transportationExpenses = input.nextDouble();
		taxForTransportation = transportationExpenses * fairTax;
	}
	
	public static void educationTax(){
		System.out.print("Enter your expenses on education: ");
		double educationExpenses = input.nextDouble();
		taxForEducation = educationExpenses * fairTax;
	}
	
	public static void healthCareTax(){
		System.out.print("Enter your expenses on healthCare: ");
		double healthCareExpenses = input.nextDouble();
		taxForHealthCare = healthCareExpenses * fairTax;
	}
	
	public static void vacationTax(){
		System.out.print("Enter your expenses on vacation: ");
		double vacationExpenses = input.nextDouble();
		taxForVacation = vacationExpenses * fairTax;
		System.out.println("\n------------------------------------------------------------------------------------------------\n");
	}
}