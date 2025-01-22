import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers = {6,19,2,29,1,30,8,3,12,4};
		
		//usinf the sort method
		Arrays.sort(numbers);
		
		//using the binarySearch method
		int index = Arrays.binarySearch(numbers,30);
		
		System.out.printf("The index number of 30 is %d%n",index);
		System.out.println("====================================");
		
		for(int element : numbers){
			System.out.printf("%d%n",element);
		}
		
		
		//using the sort method to sort a range
		// Arrays.sort(numbers,4,9);
		
		System.out.println("====================================");
		
		//equality and comparison
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.printf("%b%n",isEqual);
		
		System.out.println("====================================");
		
		//filling an array
		int[] myArrays = new int[5];
		Arrays.fill(myArrays,20);
		
		for(int component : myArrays){
			System.out.printf("%d%n",component);
		}
		
		System.out.println("====================================");
		//copy an array
		int[] original = {1,2,3};
		int[] copy = Arrays.copyOf(original, 5);
		
		for(int value : copy){
			System.out.printf("%d%n",value);
		}
		
		System.out.println("====================================");
		
		//converting arrays to string 
		String copyArray = Arrays.toString(copy);
		System.out.printf("%s%n",copyArray);
	}
}