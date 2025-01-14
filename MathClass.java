import java.util.Scanner;

public class MathClass{
	// creating the number variable as a static variable
	public static double firstNumber;
	public static double secondNumber;
	public static double thirdNumber;
	
	public static void main(String[] args){
		// creating the scanner object
		Scanner input = new Scanner(System.in);
		
		
		//creating the v
		
		//prompting the user to input 3 numbers
		System.out.print("Enter the first number: ");
		firstNumber = input.nextDouble();
		
		System.out.print("Enter the second number: ");
		secondNumber = input.nextDouble();
		
		System.out.print("Enter the third number: ");
		thirdNumber = input.nextDouble();
		
		//calling minimum() method
		MathClass.minimum();
		
		//calling maximum() method
		MathClass.maximum();
		
		//calling squareRoot() method
		MathClass.squareRoot();
		
		//calling absoluteValue() method
		MathClass.absoluteValue();
		
		//calling power() method
		MathClass.power();
		
		//calling randomNumbers() method
		MathClass.randomNumbers();
		
		
		
		
	}
	
	//created a method to find the lowest value
	public static void minimum(){
		double minValue = Math.min(firstNumber, secondNumber);
		minValue = Math.min(minValue, thirdNumber);
		System.out.printf("%n%nThe lowest value is %.1f%n%n",minValue);
	}
	
	//created a method to find the highest value
	public static void maximum(){
		double maxValue = Math.max(firstNumber, secondNumber);
		maxValue = Math.max(maxValue, thirdNumber);
		System.out.printf("The highest value is %.1f%n%n%n",maxValue);
	}
	
	//created a method to find the squareroot of all numbers
	public static void squareRoot(){
		//squareroot of fisrt number
		double squareRootOfFirstNumber = Math.sqrt(firstNumber);
		System.out.printf("The Square root of %.1f is %f%n",firstNumber,squareRootOfFirstNumber);
		
		//squareroot of second number
		double squareRootOfSecondNumber = Math.sqrt(secondNumber);
		System.out.printf("The Square root of %.1f is %f%n",secondNumber,squareRootOfSecondNumber);
		
		//squareroot of third number
		double squareRootOfThirdNumber = Math.sqrt(thirdNumber);
		System.out.printf("The Square root of %.1f is %f%n%n%n",thirdNumber,squareRootOfThirdNumber);
	}
	
	//created a method to find the absolute of all numbers
	public static void absoluteValue(){
		//absolute value of first number
		double absOfFirstNumber = Math.abs(firstNumber);
		System.out.printf("The abosolute of %.1f is %f%n",firstNumber,absOfFirstNumber);
		
		//absolute value of second number
		double absOfSecondNumber = Math.abs(secondNumber);
		System.out.printf("The abosolute of %.1f is %f%n",secondNumber,absOfSecondNumber);
		
		//absolute value of third number
		double absOfThirdNumber = Math.abs(thirdNumber);
		System.out.printf("The abosolute of %.1f is %f%n%n%n",thirdNumber,absOfThirdNumber);
	}
	
	//created a method to find the power of all numbers
	public static void power(){
		//absolute value of first number
		double powOfFirstNumber = Math.pow(firstNumber, 2);
		System.out.printf("The power of %.1f is %f%n",firstNumber,powOfFirstNumber);
		
		//absolute value of second number
		double powOfSecondNumber = Math.pow(secondNumber, 2);
		System.out.printf("The power of %.1f is %f%n",secondNumber,powOfSecondNumber);
		
		//absolute value of third number
		double powOfThirdNumber = Math.pow(thirdNumber, 2);
		System.out.printf("The power of %.1f is %f%n%n%n",thirdNumber,powOfThirdNumber);
	}
	
	//created a method that will generate random numbers and return the average
	public static void randomNumbers(){
		int sumOfNumbers = 0;
		int i = 1;
		while(i<=10){
			int number = (int) (Math.random() * 100);
			sumOfNumbers += number;
			i++;
		}
		
		int theAverage = sumOfNumbers/10;
		System.out.printf("The average of the 10 numbers is %d", theAverage);
	}
}