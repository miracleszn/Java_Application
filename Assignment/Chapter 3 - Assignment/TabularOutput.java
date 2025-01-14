public class TabularOutput{
	public static void main(String[] args){
		
		System.out.printf("%-10s %-10s %-10s %-10s%n%n", "N", "10*N", "100*N", "1000*N");
		System.out.printf("%-10s %-10s %-10s %-10s%n", "1", "10", "100", "1000");
		System.out.printf("%-10s %-10s %-10s %-10s%n", "2", "20", "200", "2000");
		System.out.printf("%-10s %-10s %-10s %-10s%n", "3", "30", "300", "3000");
		System.out.printf("%-10s %-10s %-10s %-10s%n", "4", "40", "400", "4000");
		System.out.printf("%-10s %-10s %-10s %-10s%n", "5", "50", "500", "5000");
		
		double growthRate = 0.87/100;
		System.out.println(growthRate);
		
	}
}