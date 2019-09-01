
import java.util.Scanner;

public class removeXfromstringrecur {

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
	    	StringBuilder s2=new StringBuilder();
	    	StringBuilder s1=new StringBuilder();
	    	char ch=str.charAt(0);
	    	int count=0;
	    	String ab=str.substring(1);
	    	s1.append(ch);
	    	for(int i=1;i<str.length();i++)
	    	{
	    		if(str.charAt(i)!='x')
	    		{
	    			s1.append(str.charAt(i));
//	    			count++;
	    		}
	    		else
	    		{
	    			s2.append("x");
//	    			count++;
//	    			s1.append(str.charAt(i));
	    		}
	    		
//	    		while(count!=0)
//	    		{
//	    			s1.append('x');
//	    		}
	    	}
//	    	System.out.print(s1);
	    	s1.append(s2);
	    	dup1(ab);
	    	return s1.toString();
	    	
	    }
}
