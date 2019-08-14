
public class oddeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ab=new StringBuilder("abej");
		odev(ab);
	}
	public static void odev(StringBuilder sb)
	{
		char nch=0;
		StringBuilder s=new StringBuilder();
		for(int i=0;i<sb.length();i++)
		{
			if(i%2==0)
			{
				nch=(char)(sb.charAt(i)+1);
//				s.append(nch);
			}
			else
			{
				nch=(char)(sb.charAt(i)-1);
//				s.append(nch);
			}
		
		s.append(nch);
		}
//		s.append(sb.charAt(sb.length()-1));
//		if((sb.length()-1)%2==0)
//		{
//			nch=(char)(sb.charAt(sb.length()-1)+1);
//		}
//		else
//		{
//			nch=(char)(sb.charAt(sb.length()-1)-1);
//		}
		System.out.print(s);
		
	}

}
