import java.util.Random;

public class RandomNumbers{
	public static void main(String[] args){
		Random random = new Random();
		
		//generating whole numbers
		//create a variable to syore the random number generated
		
		int randomNum = random.nextInt();
		
		//print the random number
		System.out.printf("Random Number is: %d%n", randomNum);
		
		//generating a number within a range
		int randomNumInRange = random.nextInt(20) + 1;
		
		//print number in range
		System.out.printf("Random number in range is: %d%n", randomNumInRange);
		
		//generating a float-point number
		double floatPointNum = random.nextDouble();
		
		//print the random float number
		System.out.printf("Random Double Number is: %.2f%n", floatPointNum);
		
		//generating a float point number within a range
		
		double min = 10.0;
		double max = 20.0;
		
		double randomFloatPointInRange = min + (max - min) * random.nextDouble();
		System.out.printf("Random double number in range is: %.2f%n", randomFloatPointInRange);
		
		//generate a random boolean value
		boolean booleanValue = random.nextBoolean();
		
		//print
		System.out.printf("Random Boolean is: %b%n", booleanValue);
	}
}