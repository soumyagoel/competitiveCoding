package june26;

public class revstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1=new String("123");
       String s2=new String("456");
       int a=rev1(s2);
       int b=rev(s1); 
       int c=rev2(b);
       boolean d=rev3(a,c);
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(c);
       System.out.println(d);
	}
	public static int rev(String s3)
	{
		if(s3.length()==0)
		{
			return 0;
		}
		int a=s3.charAt(0);
		String ab=s3.substring(1);
		int ab2=rev(ab);
		int rem=a%10;
		int ac=(int)a-48;
		a=a/10;
		ab2=ab2*10+ac;
		return ab2;
	}
	public static int rev1(String s4)
	{
		if(s4.length()==0)
		{
			return 0;
		}
		int a=s4.charAt(0);
		String ab1=s4.substring(1);
		int ab3=rev1(ab1);
		int rem=a%10;
		int ac=(int)a-48;
		a=a/10;
		ab3=ab3*10+ac;
		return ab3;
	}
	public static int rev2(int b)
	{
		int sum=0;
		while(b!=0)
		{
			int rem=b%10;
			sum=sum*10+rem;
			b=b/10;
		}
		return sum;
	}
     public static boolean rev3(int a,int c)
     {
    	 if(a==c)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
}
