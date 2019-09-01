
import java.util.Scanner;

public class repeatcountrecur {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=scn.next();
		int s1=count(s);
		System.out.println(s1);
	}
	public static int count(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int c=0;
		for(int i=0;i<str.length()-2;i+=2)
		{
			char ch=str.charAt(i);
			char ch1=str.charAt(i+1);
			char ch2=str.charAt(i+2);
			String s3=str.substring(i+2);
			if(ch=='a'&&ch1=='a'&&ch2=='a')
			{
				c++;
			}
			else
			{
				continue;
			}
			count(s3);
		}
		return c;
	}

}
