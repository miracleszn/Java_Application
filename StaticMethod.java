import java.util.Scanner;

public class StaticMethod{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//calling the method sum
		StaticMethod.sum();
		StaticMethod.divide(90,70);
		System.out.println(StaticMethod.product());
		
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = input.nextLine();
		
		System.out.println(StaticMethod.personName(firstName,lastName));
	}
	
	public static void sum(){
		int x = 50;
		int y = 30;
		int total = x + y;
		System.out.printf("Sum of the two numer is %d%n", total);
	
	}
	// 
	public static void divide(int x, int y){
		double total = (double)x / y;
		System.out.printf("The second Sum of the two numer is %f%n", total);
	}
	//static method with return type
	public static int product(){
		int x = 60;
		int y = 10;
		int mul;
		return mul = x * y;
	}
	
	public static String personName(String firstName,String lastName){
		String fullName = firstName + " " + lastName
		return fullName;
	}
}