
public class improvelargelengthrecur 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		int a=largecommonlength("adefg","aefbg");
//		System.out.println(a);
		int b=iterative("adefg","aefbg");
		System.out.println(b);		
	}
	public static int largecommonlength(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
		char ch=s1.charAt(0);
		String ab=s1.substring(1);
		char ch1=s2.charAt(0);
		String ab1=s2.substring(1);
		if(ch==ch1)
		{
			return 1+largecommonlength(ab,ab1);
		}
		else
		{
			int c=largecommonlength(ab,s2);
			int d=largecommonlength(s1,ab1);
			return Math.max(c, d);
		}		
	}
	public static int iterative(String s1,String s2)
	{
		int n=s1.length();
		int m=s2.length();
		int[][] strg=new int[n+1][m+1];
		for(int i=n-1;i>=0;i--)
		{
			for(int j=m-1;j>=0;j--)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					strg[i][j]=1+strg[i+1][j+1];
				}
				else if(strg[i][j+1]>strg[i+1][j])
				{
				    strg[i][j]=strg[i][j+1];
				}
				else
				{
					strg[i][j]=strg[i+1][j];
				}
			}
		}
		return strg[0][0];
	}
}
