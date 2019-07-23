

import java.util.Scanner;


public class prime1 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the one number");
		int n1=scn.nextInt();
		System.out.println("enter another number");
		int n2=scn.nextInt();
		int count;
		while(n1<=n2)
		{
			count=2;
		     while(count<n1)
		     {
		    	 if(n1%count==0)
		    	 {
		    		 break;
		    	 }
		    	 count++;
		     }
		     if(n1==count)
		     {
		    	 System.out.println(n1);
		     }
		     n1++;
		}
	}

}
