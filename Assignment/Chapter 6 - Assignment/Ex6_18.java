import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ex6_18
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		boolean[]seatsStatus=new boolean[10];
		Arrays.fill(seatsStatus,false);
		int seatNo;
		int num=0;
		int economyControl=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Please type 1 for First class ");
			System.out.print("Please type 2 for Economy: ");
			int response=scan.nextInt();
			scan.nextLine();
			if(response==1)
			{
				for(int r=0;r<1;r++)
				{
					if(seatsStatus[num]==false)
					{
						seatNo=num+1;
						seatsStatus[num]=true;
						System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tFirst%n",seatNo);
						break;
					}
	
					else
					{
						System.out.println("First Class full \n(Would you like to move to economy(Y/N): ");
						String response2=scan.next();
						if(response2.equalsIgnoreCase("y"))
						{
							for(int a=5;a<=10;a++)
							{
								if(seatsStatus[a-1]==false){
									seatNo=a;
									seatsStatus[a-1]=true;
									System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tEconomy%n",seatNo);
									break;
								}
								else{
									System.out.println("All economy Seats has been Taken");
								}
								
								
							}
						}
						else
						{
							System.out.println("Next Flight leaves in 3 Hours");
						}
						
					}
					
				}
			if(num<4){
				num++;
			}
				
				
					
			}
			else
			{
				for(int j=5;j<=10;j++)
				{
					if(seatsStatus[economyControl]==false)
					{
						seatNo=economyControl+1;
						seatsStatus[economyControl]=true;
						System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tEconomy%n",seatNo);
						break;
					}
					else
					{
						System.out.println("Economy full(would you like to move to FirstClass(Y/N): ");
						String response3=scan.nextLine();
						if(response3.equalsIgnoreCase("y"))
						{
						
							for(int h=1;h<=5;h++)
							{
								if(seatsStatus[h-1]==false)
								{
									seatNo=h;
									seatsStatus[h-1]=true;
									num=1;
									System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tFirst%n",seatNo);
									break;

								}
								else
								{
									System.out.println("All firstclass seats taken");
								}
							}
						}
						else
						{
							System.out.println("Next flight leaves in 3 hours");
						}
					
					}
					break;
				
				}
				if(economyControl<9)
					economyControl++;

			}
			
		}
		
		
	}
}