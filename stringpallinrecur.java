
public class stringpallinrecur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("1234");
		int a=pal1(s);
		int b=pal2(a);
		boolean c=pal(s,0,s.length()-1);
		System.out.println(c);
	}
	
	public static int pal1(String s4)
	{
		if(s4.length()==0)
		{
			return 0;
		}
		int a=s4.charAt(0);
		String ab1=s4.substring(1);
		int ab3=pal1(ab1);
		int rem=a%10;
		int ac=(int)a-48;
		a=a/10;
		ab3=ab3*10+ac;
		return ab3;
	}
	public static int pal2(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		return sum;
	}
	public static boolean pal3(int b,String str)

	{
		int d=0;
		while(b!=0)
		{
			b=b/10;
			d++;
		} 
		for(int i=0;i<str.length();i++)
		{
			int rem=b%10;
			if(rem!=str.charAt(i))
			{
				return false;
			}
			b=b/10;
		}
		return true;
		
	}

public static boolean pal(String s,int vidx,int vidx1)
{
	if(s.charAt(vidx)!=s.charAt(vidx1))
	{
		return false;
	}
	if(vidx>s.length()/2&&vidx1<s.length()/2)
	{
		return true;
	}
//	else
//	{
//		pal(s,vidx+1,vidx1-1);
//	}
	boolean b=pal(s,vidx+1,vidx1-1);
	return b;
	}
}
