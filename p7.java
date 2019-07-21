
package june9;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int inv=0;
		int p=1;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
		    inv=inv+p*(int)Math.pow(10,rem-1);
			p=p+1;
		}
		System.out.println(inv);
		
	}

}
