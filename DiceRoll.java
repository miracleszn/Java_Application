import java.security.SecureRandom;

public class DiceRoll{
	public static void main(String[] args){
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int dieRoll = randomNumbers.nextInt(6) + 1;
		
		System.out.println("You rolled a: " + dieRoll);
		
	}
}