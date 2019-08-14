package june19;

public class asciidiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ab=new StringBuilder("abcd");
		diff(ab);
//		System.out.print(ab);
	}
	public static void diff(StringBuilder sb)
	{
		int d;
		StringBuilder s=new StringBuilder();
		for(int i=0;i<sb.length()-1;i++)
		{
		    d=(int)(sb.charAt(i)-sb.charAt(i+1));
			s.append(sb.charAt(i));
			s.append(d);
		}
		s.append(sb.charAt(sb.length()-1));
//		s.append(sb.length()-1);
		System.out.print(s);
	}
}
