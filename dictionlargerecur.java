
import java.util.Scanner;

public class dictionlargerecur {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s=scn.next();
		dictlarge(s,"");
	}
	public static void dictlarge(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		for(int i=0;i<ques.length();i++)
		{		
//		char ch1=ques.charAt(i);
		String roq=ques.substring(0,i)+ques.substring(i+1);
		dictlarge(roq,ans+ch);
		}
	}

}
