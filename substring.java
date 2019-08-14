package june19;

public class substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substrings("abcd");
     }
	public static void substrings(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			System.out.println(s.substring(i,j));
			}
		}
	}

}
