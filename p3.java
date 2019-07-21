package june9;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int dec=scn.nextInt();
		int db=scn.nextInt();
		int b,pow,rem;
        pow=1;
		b=0;
		while(dec!=0)
		{
			rem=dec%db;
			dec=dec/db;
			b=b+rem*pow;
			pow=10*pow;
		}
		System.out.println(b);
		
	}

}
