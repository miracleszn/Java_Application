public class Ex6_11
{
	public static void main(String[]args)
	{
		int bestScores[]={2,4,6,8,10};
		int bonus[]=new int[15];
		int count[]=new int[10];//by default it is set to zero;
		for(int i=0;i<10;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<15;i++)
		{
			bonus[i]+=1;
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(bestScores[i]);
		}
	}
}