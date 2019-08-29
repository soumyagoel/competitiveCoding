package june26;
import java.util.ArrayList;
import java.util.Scanner;
public class keypad 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String ch=scn.next();
//		String st=getcode(ch);
		ArrayList<String> inter=getkey(ch);
		System.out.print(inter);
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
	public static ArrayList<String> getkey(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char ab=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> st=getkey(ros);
		ArrayList<String> mr=new ArrayList<String>();
		for(String rs:st)
		{
			String code=getcode(ab);
			for(int i=0;i<code.length();i++)
			{	
				String ms=code.charAt(i)+rs;
				mr.add(ms);
			}
		}
		return mr;
	}
}
