
public class improvepath 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=cbp(0,10,new int[11]);
        System.out.println(a);
	}
	public static int cbp(int curr,int end,int[] strg)
	{
		if(curr==end)
		{
			return 1;
		}
		if(curr>end)
		{
			return 0;
		}
		if(strg[curr]!=0)
		{
			return strg[curr];
		}
		int count=0;
		for(int dice=1;dice<=6;dice++)
		{
			count+=cbp(curr+dice,end,strg);
			
		}
		strg[curr]=count;
		return count;
	}
}
