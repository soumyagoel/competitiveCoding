package june26;

import java.util.Scanner;

public class variationkpc {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=scn.next();
		kpc(s,"");

	}

	public static String getcode(char ch)
	{
		if(ch=='1')
		{
			return "abc";
		}
		else if(ch=='2')
		{
			return "def";
		}
		else if(ch=='3')
		{
			return "ghi";
		}
		else if(ch=='4')
		{
			return "jkl";
		}
		else if(ch=='5')
		{
			return "mno";
		}
		
		else if(ch=='6')
		{
			return "pqrs";
		}
		else if(ch=='7')
		{
			return "tuv";
		}
		else if(ch=='8')
		{
			return "wx";
		}
		else if(ch=='9')
		{
			return "yz";
		}
		else 
		{
			return ";_";
		}
	}
	public static void kpc(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		String code=getcode(ch);
		for(int i=0;i<code.length();i++)
		{
			kpc(roq,ans+code.charAt(i));
		}
	}
}
