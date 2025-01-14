import java.util.Scanner;

public class ModifiedCompoundIntrestProgram{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		double investedAmount = 9000.00;
		double intrest = 1.05;
		double intrestForTheYear;
		double totalAmount;
		int percent = 5;
		
		while(i <= 6){
			investedAmount = investedAmount * intrest;
			System.out.printf("Your archived intrest is %d%% of your invested amount %.2f%n",percent,investedAmount);
			percent++;
			intrest = intrest + 0.01;
			i++;
		}	
	}
}