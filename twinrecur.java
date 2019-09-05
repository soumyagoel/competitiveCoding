package june26;

import java.util.Scanner;

public class twinrecur {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s=scn.next();
		int s1=twinp(s);
		if(s1==1)
		{
			System.out.println("twin");
		}
		else
		{
        System.out.println(s1+"twin");
		}
	}
	public static int twinp(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int c=0;
		StringBuilder s2=new StringBuilder();
		for(int i=0;i<str.length()-2;i++)
		{
			String s4=str.substring(i+2);
			if(str.charAt(i)==str.charAt(i+2))
			{
				c++;
			}
			else
			{
				continue;
			}

		twinp(s4);
		}
//		return s3.toString();
		return c;
	}


}