package june26;
import java.util.ArrayList;
public class sumdigitrecursion {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s=new String("456");
		int inter=sum(s);
		System.out.println(inter);
	}
	public static int sum(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int b=str.charAt(0);
		String ab=str.substring(1);
		int c=sum(ab);
		int a=(int)b-48;
	    c=c+a;
	    return c;
	}
}
