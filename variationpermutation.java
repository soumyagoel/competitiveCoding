
public class variationpermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            per("abc","");
	}
	public static void per(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
		char ch=ques.charAt(i);
		String roq=ques.substring(0,i)+ques.substring(i+1);
//		boolean[] dup=new boolean[256];
//		if(dup[ch]==false)
//		{
		per(roq,ans+ch);
//		dup[ch]=true;
//		}
		
		}
	}

}
