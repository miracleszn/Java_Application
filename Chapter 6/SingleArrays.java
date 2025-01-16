// an array is an object, it is a refrence type, it stores more than one value at a time.
public class SingleArrays{
	public static void main (String[] args){
		
		int[] ages = {12,18,15,35,20};
		String[] names = {"Jack", "Mary", "Chisom", "Kim", "Recca"};
		
		
		//creating an array using the new keyword
		int numbers[] = new int[5];
		numbers[0] = 15;
		numbers[1] = 30;
		numbers[2] = 22;
		numbers[3] = 12;
		numbers[4] = 11;
		
		System.out.printf("Name is %s and age is %d%n", names[0],ages[0]);
		System.out.printf("The number at the second position is: %d%n", numbers[1]);
		System.out.printf("The number at the second position is: %d%n", numbers[2]);
		System.out.printf("The number at the second position is: %d%n", numbers[3]);
		System.out.printf("The number at the second position is: %d%n", numbers[4]);
	}
}