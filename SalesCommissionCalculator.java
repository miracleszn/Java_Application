import java.util.Scanner;

public class SalesCommissionCalculator{
	
	public static double weeklyPay = 200.00;
	public static double percentPerSales = 0.09;
	public static double grossSales = 0.00;
	public static double totalValue = 0.00;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		double valueOfFirstItem = 239.99;
		double valueOfSecondItem = 129.75;
		double valueOfThirdItem = 99.95;
		double valueOfFourthItem = 350.89;
		int numberOfItem;
		
		System.out.printf("1. Item 1 = %f%n2. Item 2 = %f%n",valueOfFirstItem,valueOfSecondItem);
		System.out.printf("3. Item 3 = %f%n4. Item 4 = %f%n",valueOfThirdItem,valueOfFourthItem);
		
		do{
			System.out.print("Enter the number of item you sold (Enter 0 to stop): ");
			numberOfItem = input.nextInt();
			
			if(numberOfItem == 1){
				totalValue = totalValue + valueOfFirstItem;
				System.out.printf("Item 1 has been added%n");
			} else if(numberOfItem == 2){
				totalValue = totalValue + valueOfSecondItem;
				System.out.printf("Item 2 has been added%n");
			} else if(numberOfItem == 3){
				totalValue = totalValue + valueOfThirdItem;
				System.out.printf("Item 3 has been added%n");
			} else if(numberOfItem == 4){
				totalValue = totalValue + valueOfFourthItem;
				System.out.printf("Item 4 has been added%n");
			} else if(numberOfItem == 0){
				System.out.println("Calculating......");
				SalesCommissionCalculator.calculateGrossPay();
			} else
				System.out.println("Invalid Input");
			
			
		} while(numberOfItem != 0);
		
			
		
	}
	
	public static void calculateGrossPay(){
		grossSales = totalValue * percentPerSales;
		double totalWeeklyPay = grossSales + weeklyPay;
		System.out.printf("Your total sales from last week is %.2f%n",totalValue);
		System.out.printf("Your Percentage from the total sales of last week is %.2f%n",grossSales);
		System.out.printf("The Total Pay for last week is %.2f",totalWeeklyPay);
		
	}
}