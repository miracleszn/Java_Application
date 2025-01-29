public class ForEachMultiDimensionalArray
{
	public static void main(String[]args)
	{
		int[][]numbers={{3,4,5,4,3},{4,5,6,5,2},{8,9,0,6,4}};
		for(int []n:numbers)//why?
		{
			for(int b:n)
			{
				System.out.print(b +" ");
			}
			System.out.println();
		}
	}
}