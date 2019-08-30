
import java.util.ArrayList;
public class permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> inter =getper("abc");
		System.out.print(inter);
	}
	public static ArrayList<String> getper(String str)
    {
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String res=str.substring(1);
//		StringBuilder s=new StringBuilder();
		ArrayList<String> rr=getper(res);
		ArrayList<String> mr=new ArrayList<String>();
		for(String rs:rr)
		{
//			mr.add(rs);
			for(int i=0;i<=rs.length();i++)
			{
				String ms=rs.substring(0,i)+ch+rs.substring(i);
				mr.add(ms);
			}
//		    mr.add((int)ch+rs);
		}
		return mr;
	}
}
