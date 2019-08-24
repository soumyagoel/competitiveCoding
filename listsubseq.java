
import java.util.ArrayList;

public class listsubseq {
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> inter=getsubseq("abc");
        System.out.println(inter);
	}    
	public static ArrayList<String> getsubseq(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch=str.charAt(0);
		String res=str.substring(1);
		ArrayList<String> rr=getsubseq(res);
		ArrayList<String> mr=new ArrayList<String>();
		for(String rs:rr)
		{
			mr.add(rs);
			mr.add(ch+rs);
		    mr.add((int)ch+rs);
		}
		return mr;
	}
}
