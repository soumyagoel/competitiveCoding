package june19;

public class stringsubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder ab=new StringBuilder("abcd");
		subseq("abcd");
	}
	public static void subseq(String sb)
	{
//		StringBuilder s=new StringBuilder();
		int a=(int)Math.pow(2,sb.length());
		int count=0;
		while(count<a)
		{
			int temp=count;
			for(int i=0;i<sb.length();i++)
			{
			int rem=temp%2;
			if(rem==1)
			{
				System.out.print(sb.charAt(i));
			}
			temp=temp/2;
			}
			System.out.println();
			count++;
			
		}
	}
}
