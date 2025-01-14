public class ContinueStatement{
	public static void main(String[] args){
		
		int i = 0;
		while(i <= 10){
			if (i == 5)
				continue;
			System.out.printf("%d", i);
			i++;
		}
		System.out.println("This is the end of the loop");
		
	}
}