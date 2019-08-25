
	import java.util.ArrayList;
		/**
		 * @param args
		 */
	public class multimoves
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> inter = matrix(0,0,2,2);
			System.out.println(inter);
		}
		public static ArrayList<String> matrix(int crow,int ccol,int erow,int ecol)
		{
			if(crow==erow&&ccol==ecol)
			{
				ArrayList<String> br=new ArrayList<String>();
				br.add("");
				return br;
			}
			if(crow>erow||ccol>ecol)
			{
				ArrayList<String> br=new ArrayList<String>();
				return br;
			}
			ArrayList<String> mr=new ArrayList<String>();
			for(int h=1;h+ccol<=ecol;h++)
			{
				ArrayList<String> rr1=matrix(crow,ccol+h,erow,ecol);
				for(String rs:rr1)
				{
					mr.add("H"+h+rs);
				}
			}
			for(int v=1;v+crow<=erow;v++)
			{
				ArrayList<String> rr2=matrix(crow+v,ccol,erow,ecol);
				for(String rs:rr2)
				{
					mr.add("V"+v+rs);
				}
				
			}			
			for(int d=1;d+crow<=erow&&d+ccol<=ecol;d++)
			{
				ArrayList<String> rrd=matrix(crow+d,ccol+d,erow,ecol);
				for(String rs:rrd)
				{
					mr.add("D"+d+rs);
				}
				
			}
			return mr;
		}
	}


