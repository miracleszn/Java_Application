public class WorldPopulationGrowth{
	public static void main(String[] args){
		
		double growthRate = (0.87/100) + 1;
		long currentPopulation = 8191230837L;
	
		
		System.out.printf("%-10s %-10s %-10s %-10s%n%n", "Years", "WorldPopulation",  "GrowthRate%%");
		
		for(int i = 1; i <=75; i++){	
		System.out.printf("%-10s %-26d %-10s%n", "Year", currentPopulation, "0.87%%");
		currentPopulation = (long) (currentPopulation * (1 + growthRate));
		}	
	}
}