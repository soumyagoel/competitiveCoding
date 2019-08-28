package june26;
import java.util.Scanner;
public class asciirecur 
{
	/**
	 * @param args
	 */
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		// TODO Auto-generated method stub
		String s = scn.next();
		ascii(s, "");
	}
	public static char asc(String ch) 
	{
		// int i=0;
		char nch;
		// for(int i=1;i<=26;i++)
		// {
		// nch=(char)(i+71);
		// }
		// return nch;
		int n = Integer.parseInt(ch);
		nch =(char) ( 'a' + n - 1);
		return nch;
	}
	public static void ascii(String ques, String ans) 
	{
		if (ques.length() == 0) 
		{
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length() && i<=2; i++) 
		{
			String ch1 = ques.substring(0, i);
			if(Integer.parseInt(ch1) <= 26)
			{
			char ch2 = asc(ch1);
			String roq = ques.substring(i);
			ascii(roq, ans + ch2);
			}
		}
	}
}
