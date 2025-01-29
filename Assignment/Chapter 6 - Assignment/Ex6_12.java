import java.util.Scanner;
import java.util.Arrays;
public class Ex6_12
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int[] uniqueNums=new int[5];
		Arrays.fill(uniqueNums,-1);
		int num;
		// int count=0;
		int i=0;
		String array;


		
		while(true)
		{
			System.out.print("Enter a unique number: ");
			num=scan.nextInt();
			if(num<10||num>100)
			{
				continue;
			}
			else 
			{
				// Arrays.sort(uniqueNums);
				int index=Arrays.binarySearch(uniqueNums,num);
				if(index<0)
				{
					uniqueNums[i]=num;
					Arrays.sort(uniqueNums,0,i+1);
					array=Arrays.toString(uniqueNums);
					System.out.println(array);
					i++;
					if(i==5)
					{
						break;
					}	
					
				}
				
				else
				{
					continue;
				}
			}
			
		}	
	}
}