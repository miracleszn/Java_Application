import java.util.Scanner;
import java.util.Random;



public class CrapsGameModification{
	
	public static Random random = new Random();
	public static int bankBalance = 1000;
	public static int wager;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		while(true){
			System.out.print("Enter a wager: ");
			wager = input.nextInt();
			
			if(wager <= bankBalance){
				break;
			} else {
				System.out.println("Enter a valid wager!!");
				continue;
			}
		}
		
		
		
	}
	
	public static int rolling(){
		System.out.println("Rolling......");
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		int result = dice1 + dice2;
		return result;
	}
	
	
	public static int naturalOrCraps(){
		
		int result = CrapsGameModification.rolling()
		
		if(result == 7 || result == 11){
			System.out.println("Your Roll is natural!!!\nYou have won!!!");
		} else if(result == 2 || result == 3 || result == 12){
			System.out.println("You Roll is craps!!!\nYou have lost!!!");
		} else {
			System.out.println("You have established a point...");
		}
		
		System.out.printf("%-20s %-20s%n", "Dice 1", "Dice 2");
		System.out.printf("%-20s %-20s%n", "2", "2");
		
	}
	
	
	public static int establishPoint(){
		
		int result = CrapsGameModification.rolling()
		
		if(result == 7){
			System.out.println("You have lost!!!");
			break;
		} else if(result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10){
			System.out.println("You have won!!!");
			break;
		} else
			CrapsGameModification.establishPoint()
	}
	
	
	
	
	
	
	
	
	public static void chatter(){
		String[] messages = {
			"Oh, you're going for broke, huh?",
			"Aw c'mon, take a chance!",
			"You're up big. Now's the time to cash in your chips!"};
			
		String randomMessage = messages[random.nextInt(2) + 1];
		System.out.println(randomMessage);
	}
}