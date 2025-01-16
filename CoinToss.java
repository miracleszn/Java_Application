import java.security.SecureRandom;

public class CoinToss{
	public static void main(String[] args){
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int coinToss = randomNumbers.nextInt(2); // 0 or 1
		
		if (coinToss == 0) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
		
	}
}