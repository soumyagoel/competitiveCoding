package june12;

import java.util.Scanner;

public class fartocel {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int minf=scn.nextInt();
		System.out.println("enter another number");
		int maxf=scn.nextInt();
		int temp;
		while(minf<=maxf)
		{
			temp=(int)((5.0/9)*(minf-32));
			minf++;
		System.out.println(temp+" "+minf);
		}
	    
	}
	}