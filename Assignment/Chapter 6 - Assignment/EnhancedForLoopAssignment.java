public class EnhancedForLoopAssignment{
	public static void main(String[] args){
		int[][] numbers = {{3, 4, 5}, {4, 5, 6}, {8, 9, 0}};
		
		for(int[] row : numbers)
		{
			for(int element : row){
			System.out.println("Element at index " + "[" + row + "]" + "[" + element + "] = " + element);
			}
		}
	}
}	
