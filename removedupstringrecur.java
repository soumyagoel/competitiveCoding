
import java.util.Scanner;

public class removedupstringrecur {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=scn.next();
		String s3=dup1(s);
		System.out.print(s3);

	}
	 public static String dup1(String str)
	    {
	    	if(str.length()==0)
	    	{
	    		return "";
	    	}
	    	StringBuilder s1=new StringBuilder();
	    	char ch=str.charAt(0);
	    	String ab=str.substring(1);
	    	s1.append(ch);
	    	for(int i=1;i<str.length();i++)
	    	{
	    		if(str.charAt(i-1)!=str.charAt(i))
	    		{
	    			s1.append(str.charAt(i));
	    		}
	    		else
	    		{
	    			s1.append("");
//	    			s1.append(str.charAt(i));
	    		}
	    	}
	    	dup1(ab);
	    return s1.toString();
	    }
}
