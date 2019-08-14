package june19;
public class countpallindromesub 
{
	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=countpallin("abc");		
		System.out.println(c);
}	
	public static int countpallin(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String b=s.substring(i,j);
				if(ispallindrome(b))
				{
					count++;
				}
		  }
     }
	return count;
}
	public static boolean ispallindrome(String s)
	{
		int j=s.length()-1;;
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			j--;
		}
		return true;
	}

}