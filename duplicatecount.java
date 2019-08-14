package june19;

public class duplicatecount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ab=new StringBuilder("aaabbcba");
		duplicate(ab);

	}
	public static void duplicate(StringBuilder sb)
	{
		int count=1;
		StringBuilder s =new StringBuilder();
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i)!=sb.charAt(i+1))
			{
				s.append(sb.charAt(i));
		        if(count>1)
		        	{
		        	s.append(count);
		        	}
		        count=1;
		        
			}
			else if(sb.charAt(i)==sb.charAt(i+1))
				{
					count++;
				}
			
			
		}
		
			s.append(sb.charAt(sb.length()-1));
			if(count>1)
			{
				s.append(count);
			}
			System.out.print(s);
			

		
	}

}
