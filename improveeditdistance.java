
public class improveeditdistance 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//        int a=recur("abcefh","ackfzh");
//        System.out.println(a);
		int b=iterative("abcefh","ackfzh");
        System.out.println(b);
	}
	public static int recur(String s1,String s2)
	{
		if(s1.length()==0)
		{
			return s2.length();
		}
		if(s2.length()==0)
		{
			return s1.length();
		}
		char ch=s1.charAt(0);
		char ch1=s2.charAt(0);
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		if(ch==ch1)
		{
			return recur(ros1,ros2);
		}
		else
		{
			int finsert=1+recur(ros1,s2);
			int freplace=1+recur(ros1,ros2);
			int fremove=1+recur(s1,ros2);
			return Math.min(finsert, Math.min(freplace, fremove));
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
					strg[i][j]=strg[i+1][j+1];
				}
				else
				{
					int c=Math.min(strg[i][j+1],Math.min(strg[i+1][j],strg[i+1][j+1]));
					strg[i][j]=1+c;
				}
			}
		}
		return strg[0][0];
	}
}
