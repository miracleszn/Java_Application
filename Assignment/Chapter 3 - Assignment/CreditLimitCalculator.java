import java.util.Scanner;

public class CreditLimitCalculator{
	
	public static int accountNumber;
	public static int balanceStartingOfTheMonth;
	public static int charges;
	public static int totalNumberOfCreditApplied;
	public static int creditLimit;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while(true){
		System.out.print("Enter account number: ");
		accountNumber = input.nextInt();
		if(accountNumber == -1)
			break;
		
		System.out.print("Enter balance at the beginning of month: ");
		balanceStartingOfTheMonth = input.nextInt();
		
		System.out.print("Enter total of all items charged this month: ");
		charges = input.nextInt();
		
		System.out.print("Enter total number of credit applied: ");
		totalNumberOfCreditApplied = input.nextInt();
		
		System.out.print("Enter your allowed credit limit: ");
		creditLimit = input.nextInt();
		
		CreditLimitCalculator.calculatingCreditLimit();
		}
		
		
	}
	public static void calculatingCreditLimit(){
		int newBalance = balanceStartingOfTheMonth + charges - totalNumberOfCreditApplied;
		if(newBalance > creditLimit)
			System.out.printf("%nCredit limit exceeded%n");
		else
			System.out.printf("%nYou have not exceeded your limit%n");
	}
}

