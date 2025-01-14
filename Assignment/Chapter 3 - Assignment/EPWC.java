import java.util.Scanner;

public class EPWC{
	
	public static int firstDigit;
	public static int secondDigit;
	public static int thirdDigit;
	public static int fourthDigit;
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first digit: ");
		firstDigit = input.nextInt();
		int encryptedFirstDigit = EPWC.encryptDigit(firstDigit);
		int decryptFirstDigit = EPWC.decryptDigit(encryptedFirstDigit);
		
		System.out.print("Enter the second digit: ");
		secondDigit = input.nextInt();
		int encryptedSecondDigit = EPWC.encryptDigit(secondDigit);
		int decryptSecondDigit = EPWC.decryptDigit(encryptedSecondDigit);
		
		System.out.print("Enter the third digit: ");
		thirdDigit = input.nextInt();
		int encryptedThirdDigit = EPWC.encryptDigit(thirdDigit);
		int decryptThirdDigit = EPWC.decryptDigit(encryptedThirdDigit);
		
		System.out.print("Enter the fourth digit: ");
		fourthDigit = input.nextInt();
		int encryptedFourthDigit = EPWC.encryptDigit(fourthDigit);
		int decryptFourthDigit = EPWC.decryptDigit(encryptedFourthDigit);
		
		
		System.out.printf("The Encrypted code is %d%d%d%d%n",encryptedThirdDigit,encryptedFourthDigit,encryptedFirstDigit,encryptedSecondDigit);
		
		
		
		System.out.printf("The Decrypted code is %d%d%d%d%n",decryptFirstDigit,decryptSecondDigit,decryptThirdDigit,decryptFourthDigit);
		
	}
	
	public static int encryptDigit(int digit){
		int stage1 = digit + 7;
		int stage2 = stage1 % 10;
		return stage2;
	}
	
	public static int decryptDigit(int encryptedDigit){
		int stage1 = (encryptedDigit - 7 + 10) % 10;
		return stage1;
	}
	
}