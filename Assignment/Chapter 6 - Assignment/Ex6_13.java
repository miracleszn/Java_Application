public class Ex6_13
{
	public static void main(String[]args)
	{
		int rowsCount=1;
		int[][]sales=new int[3][5];
		for (int row = 0; row < sales.length; row++) 
		{ 
			for (int col = 0; col < sales[row].length; col++) 
			{ 
				sales[row][col] = 0; 
				System.out.print(sales[row][col] + "|");
			} 
			System.out.printf("\n===Row%d===\n",rowsCount);
			rowsCount++;
		} 

	}
}