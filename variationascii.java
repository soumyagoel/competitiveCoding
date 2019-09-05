
public class variationascii {
     /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ascii("ab","");
	}
	public static void ascii(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		ascii(roq,ans+"");
		ascii(roq,ans+ch);
		ascii(roq,ans+(int)ch);
	}
}
