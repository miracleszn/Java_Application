public class ContinueStatement1{
	public static void main(String[] args){
	
		int year = 1;
		int number = 1;
		
		System.out.print("Enter the amount deposited\n");
		double amount = 1000.0;
		
	    while(year<=10) {
			amount = amount * 1.05;
			System.out.println("Year " + number + ": " + amount);
			number++;
			year++;
		}
		System.out.println("Done");
	}
}