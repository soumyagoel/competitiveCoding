
public class dupstringrecur {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s=new String("aabbbccda");
//		dup(s,s.length()-2,s.length()-1);
		String s3=dup1(s);
		System.out.print(s3);
	}
	public static void dup(String str,int vidx,int vidx1)
	{
		if(vidx==-1||vidx1==0)
		{
			return ;
		}
		StringBuilder s1=new StringBuilder();
//		char a=str.charAt(0);
//		String ab=str.substring(1);		
		if(str.charAt(vidx)!=str.charAt(vidx1))
		{
			s1.append(str.charAt(vidx));
		}
		if(str.charAt(vidx)==str.charAt(vidx1))
		{
			s1.append(str.charAt(vidx));
			s1.append("*");
//			s1.append(str.charAt(vidx1));
		}		
		dup(str,vidx-1,vidx1-1);
//		s1.append(str.charAt(str.length()-1));
		System.out.print(s1);
	}
    public static String dup1(String str)
    {
    	if(str.length()==0)
    	{
    		return "";
    	}
    	StringBuilder s1=new StringBuilder();
    	char ch=str.charAt(0);
    	String ab=str.substring(1);
    	s1.append(ch);
    	for(int i=1;i<str.length();i++)
    	{
    		if(str.charAt(i-1)!=str.charAt(i))
    		{
    			s1.append(str.charAt(i));
    		}
    		else
    		{
    			s1.append("*");
    			s1.append(str.charAt(i));
    		}
    	}
    	dup1(ab);
    	return s1.toString();
    	
    }
}
