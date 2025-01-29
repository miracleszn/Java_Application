import java.util.Scanner;
import java.util.Arrays;
public class VarargsArugumentAssignment
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the total  number of values you would like to sum: ");
		
		int num=scan.nextInt();
		int[] arrayOfNumbers=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter number: ");
			arrayOfNumbers[i]=scan.nextInt();
		}
		int []numbers=Arrays.copyOf(arrayOfNumbers,num);
		System.out.println(add(arrayOfNumbers));
	}
	public static int add(int...numbers)
	{
		int sum=0;
		for(int num:numbers)
		{
			sum+=num;
		}
		System.out.print("The sum of the values entered=");
		return sum;
	}
}