
public class duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ab=new StringBuilder("aaaabbca");
		duplicate(ab);

	}
	public static void duplicate(StringBuilder sb)
	{
		StringBuilder s =new StringBuilder();
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i)!=sb.charAt(i+1))
			{
				s.append(sb.charAt(i));
			}
			
		}
			s.append(sb.charAt(sb.length()-1));
			System.out.print(s);		
	}

}
