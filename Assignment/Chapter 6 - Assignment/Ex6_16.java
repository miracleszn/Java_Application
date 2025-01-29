public class Ex6_16
{
	public static void main(String[]args)
	{
		double sum=0;
		double parsedString;
		for(String values:args)
		{
			parsedString=Double.parseDouble(values);
			sum+=parsedString;
		}
		System.out.print(sum);
	}
}