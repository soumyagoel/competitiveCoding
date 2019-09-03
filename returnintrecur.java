
public class returnintrecur {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("1234");
        int sum=0;
        int inter=num(s);
        int c=inter;
        int n;
        while(c!=0)
        {
         n=c%10;
         sum=sum*10+n;
         c=c/10;
        }
        System.out.println(sum);
	}
	public static int num(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int b=str.charAt(0);
		String ab=str.substring(1);
		int s=num(ab);
		int n=b%10;
		int a=(int)b-48;
		b=b/10;
		s=s*10+a;
		return s;
	}
}
