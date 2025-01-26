//variable length argument list is used to create method that accept variable number of argument of the same type
public class VarargsArgument{
	public static void main(String[] args){
		//Scanner scan = new Scanner(System.in);
		System.out.println(add(6,20,3,5,7,8,5,9));
		listOfNames("Martins","Kate","Benjamin","Louis","Ray");
	}
	
	
	public static int add(int...numbers){
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		return sum;
	}
	
	public static void listOfNames(String...names){
		for(String name : names){
			System.out.printf("%s%n",name);
		}
	}
}