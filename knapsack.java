package july10;

public class knapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b={20,15,15,5,18};
		int[] c={10,15,20,5,8};
        int a=recur(b,c,0,50);
        System.out.println(a);
	}
	public static int recur(int[] wt,int[] prices,int vidx,int cap)
	{
		if(cap-wt[vidx]<0)
		{
			return 0;
		}
		int a=0;
		int b=0;
        if(vidx<wt.length)
        {
		  a=prices[vidx]+recur(wt,prices,vidx+1,cap-wt[vidx]);
        }
        else
        {
		  b=recur(wt,prices,vidx+1,cap);
        }
        return Math.max(a, b);
	}

}
