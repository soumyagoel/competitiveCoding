	package june23;

	import java.util.ArrayList;

	public class diagonal
	{
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> inter = matrix(0,0,2,2);
			System.out.println(inter);
		}
		public static ArrayList<String> matrix(int crow,int ccol,int erow,int ecol)
		{
			if(crow==erow && ccol==ecol)
			{
				ArrayList<String> br=new ArrayList<String>();
				br.add("");
				return br;
			}
			if(crow>erow || ccol>ecol)
			{
				ArrayList<String> br=new ArrayList<String>();
				return br;
			}
			ArrayList<String> mr=new ArrayList<String>();
				ArrayList<String> rrh=matrix(crow,ccol+1,erow,ecol);
				for(String rs:rrh)
				{
					mr.add("H"+rs);
				}
					ArrayList<String> rrv=matrix(crow+1,ccol,erow,ecol);
				for(String rs:rrv)
				{
					mr.add("V"+rs);
				}
				
				ArrayList<String> rrd=matrix(crow+1,ccol+1,erow,ecol);
				for(String rs:rrd)
				{
					mr.add("D"+rs);
				}
			return mr;
			
		}

	}


