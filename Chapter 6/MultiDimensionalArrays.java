public class MultiDimensionalArrays{
	public static void main(String[] args){
		int[][] numbers = {{3, 4, 5}, {4, 5, 6}, {8, 9, 0}};
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++){
				System.out.printf("Element at index [%d] [%d] = %d%n", row, col, numbers[row][col]);
			}
		}
	}
}