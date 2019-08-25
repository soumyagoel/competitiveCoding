package june23;
import java.util.ArrayList;
public class paths 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Integer[] one={1,2,3,4,5,6};
		ArrayList<String> inter =getpath(0,10);
		System.out.println(inter);
//		System.out.println(inter.size());
	}
	public static ArrayList<String> getpath(int curr,int end)
	{
		if(curr==end)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("\n");
			return br;
		}
		if(curr>end)
		{
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
		ArrayList<String> mr=new ArrayList<String>();
		for(int dice=1;dice<=6;dice++)
		{
			ArrayList<String> rr=getpath(curr+dice,end);
			for(String rs:rr)
			{
				mr.add(dice+rs);
			}
		}
		return mr;
	}
}
