
import java.util.Scanner;

public class cntrmvrplacestrrecur 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       String s=scn.next();
//		int ab=count(s);
//		System.out.println(ab);
//		count1(s);
		count2(s);
	}
	public static int count(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int c=1;
//		StringBuilder s1=new StringBuilder();
//		String b=str.substring(2);
		for(int i=0;i<str.length()-2;i++)
		{
		String b=str.substring(i+1);
		String a=str.substring(i,i+2);
//		char d=str.charAt(i+1);
		if(a.equals("hi"))
		{
			c++;
//			s1.append(c);
		}
		else
		{
			continue;
		}
		
		count(b);
	}
//		System.out.print(c);
		return c;
	}
	public static void count2(String str)
	{
		if(str.length()==0)
		{
			return ;
		}
		int c=1;
		int d=str.length();
		StringBuilder s1=new StringBuilder();
//		String b=str.substring(2);
		for(int i=0;i<d-2;i++)
		{
		String b=str.substring(i+2);
		String a=str.substring(i,i+2);
//		char d=str.charAt(i+1);
		if(a.equals("hi"))
		{
//			c++;
			s1.append("bye");
			d=d+1;
			i=i+1;
		}
		else
		{
			s1.append(str.charAt(i));
//			d=d+1;
//			i=i+1;
//			continue;
		}
		count(b);
//		d=d+1;
//		i=i+1;
	}
		System.out.println(s1);
//		return c;
	}
	public static void count1(String str)
	{
		if(str.length()==0)
		{
			return ;
		}
		int c=1;
		StringBuilder s1=new StringBuilder();
//		String b=str.substring(2);
		for(int i=0;i<str.length()-2;i++)
		{
		String b=str.substring(i+1);
		String a=str.substring(i,i+2);
//		char d=str.charAt(i+1);
		if(a.equals("hi"))
		{
//			c++;
			s1.append("");
			i=i+1;
		}
		else
		{
			s1.append(str.charAt(i));
//			continue;
		}
		
		count(b);
//		s1.append(str.charAt(i));
	}
		System.out.println(s1);
//		return c;
	}

}
