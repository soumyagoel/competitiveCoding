
public class matrixchainmultiplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d={10,20,30,40,50,60};
		int c=matrix(d,0,d.length-1);
		System.out.println(c);
//		int[][] strg=new int[d.length][d.length];
//		int b=dpmcmrecur(d,0,d.length-1,strg);
//		System.out.println(b);
	}
	public static int matrix(int[] dims,int si,int li)
	{
		if(si+1==li)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int i=si+1;i<li;i++)
		{
			int cost1=matrix(dims,si,i);
			int cost2=matrix(dims,i,li);
			int cost3=dims[si]*dims[i]*dims[li];
			int tc=cost1+cost2+cost3;
			if(tc<min)
			{
				min = tc;
			}
		}
		return min;		
	}
	public static int dpmcmrecur(int[] dims,int si,int li,int[][] strg)
	{
		if(si+1==li)
		{
			return 0;
		}
		if(strg[si][li]!=0)
		{
			return strg[si][li];
		}
		int min=Integer.MAX_VALUE;
		for(int i=si+1;i<li;i++)
		{
			
			int cost1=dpmcmrecur(dims,si,i,strg);
			int cost2=dpmcmrecur(dims,i,li,strg);
			int cost3=dims[si]*dims[i]*dims[li];
			int tc=cost1+cost2+cost3;
			if(tc<min)
			{
				min = tc;
			}
		}
		strg[si][li]=min;
		return min;				
	}
}
