
public class togglecase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ab=new StringBuilder("aaaADbBcCda");
		toggle(ab);     
	}
	public static void toggle(StringBuilder sb)
	{
		StringBuilder s=new StringBuilder();
		for(int i=0;i<sb.length();i++)
		{
			char ch=sb.charAt(i);
			char nch='\0';
			if(ch>='a'&&ch<='z')
			{
				nch=(char)(ch-'a'+'A');
			}
			else
				if(ch>='A'&&ch<='Z')
				{
					nch=(char)(ch-'A'+'a');
				}
			s.append(nch);
		}
		System.out.print(s);
	}
}
