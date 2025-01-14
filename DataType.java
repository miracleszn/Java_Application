public class DataType{
	public static void main(String[] args){
		// using boolean
		boolean isAGirl = true;
		System.out.println(isAGirl);
		
		// using char: we use single quote for character
		char alphabet = 'A';
		char alphabet1 = '?';
		System.out.println(alphabet);
		System.out.println(alphabet1);
		
		// using byte: it can only hold number from 0 - 255
		byte age = 25;
		System.out.println(age);
		
		// using short
		short quantity = 32000;
		System.out.println(quantity);
		
		// using int: we dont use it for prices
		int population = 2000000000;
		System.out.println(population);
		
		// using long: when using long you must append a l or L at the end of the number
		long worldPopulation = 3000000000000000L;
		System.out.println(worldPopulation);
		
		// using float: we add a F suffix to delcare it as a float and not a double
		float weight = 456.7F;
		System.out.println(weight);
		
		//using double: we add a D suffix to declare it as a double and not a float
		double myBalance = 23767456.4563D;
		System.out.println(myBalance);
		
		//conversion
		double balance = 500000D;
		System.out.println(balance);
	}
}