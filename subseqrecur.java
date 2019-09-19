package june28;

import java.util.ArrayList;
import java.util.Scanner;

public class subseqrecur {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=scn.next();
//		ArrayList<String> s1=sub1(s);
//		System.out.println(s1);
		sub2(s,"");

	}
	public static ArrayList<String> sub1(String str1)
	{
		if(str1.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch=str1.charAt(0);
		String ros=str1.substring(1);
		ArrayList<String> rr=sub1(ros);
		ArrayList<String> mr=new ArrayList<String>();
		for(String rs:rr)
		{
			mr.add(rs);
			mr.add(ch+rs);
		}
		return mr;
	}
	public static void sub2(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch1=ques.charAt(0);
		String ros1=ques.substring(1);
		sub2(ros1,ans+"");
		sub2(ros1,ans+ch1);
	}

}
