
public class pallindrome 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=ispallindrome("hello");
		System.out.println(a);
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
