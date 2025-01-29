import java.util.Scanner;
// import java.util.Arrays;
public class VarargsArugumentAssignment2
{
	public static void main(String[]args)
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter number or (-1 to finish) : ");
			int nums=scan.nextInt();
			if(nums==-1)
				break;
			else
				sum+=nums;
		}
		System.out.print(add(sum));
		
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