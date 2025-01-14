public class StackExample{
	public static void main(String[] args){
		methodA(); // Calling methodA
	}
	
	public static void methodA() {
		int x = 10; // Local variable in methodA
		methodB(); // Calling methodB
	}
	
	public static void methodB(){
		int y = 20; // Local variable in methodB
		// Do something with y...
	}
}
		