
import java.util.Scanner;


public class prime {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int count =2;
		while(count<n)
		{
			if(n%count==0)
			{
				System.out.print("not prime ");
				return;
			}
			else
			{
				count=count+1;
			
			}
		}
			System.out.println("prime");
			
	}

}
