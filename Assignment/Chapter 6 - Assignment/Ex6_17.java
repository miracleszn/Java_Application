import java.util.Random;
import java.util.Scanner;
public class Ex6_17
{
	public static void main(String[]args)
	{
		Random rand=new Random();
		int[]count=new int [11];
		int sum;
		int diceRoll;
		int diceRoll2;
		
		for(int i =0;i<=36000000;i++)
		{
			diceRoll=rand.nextInt(6)+1;
			diceRoll2=rand.nextInt(6)+1;
			sum=diceRoll+diceRoll2;
			count[sum-2]++;
		}
		System.out.printf("Sum\t\t\tCount");	
		for(int i=0;i<11;i++)
		{
			System.out.printf("%n%d\t\t\t%d",i+2,count[i]);	
		}
	}
}