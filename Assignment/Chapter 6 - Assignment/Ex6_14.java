public class Ex6_14
{
	public static void main(String[]args)
	{
		product(1);
		product(2,1);
		product(3,2,1);
		product(4,3,2,1);
		product(5,4,3,2,1);
	}
	public static void product(int... nums)
	{
		int pro=1;
		for(int n:nums)
		{	
			pro*=n;
		}
		System.out.print(pro + "\n");
	}
}