package june21;

public class recpallindrome 
{
	/**
	 * @param args
	 */	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr={1,2,2,1};
		boolean a=palin(arr,0,arr.length-1);
		System.out.println(a);
	}
	public static boolean palin(int[] arr,int vidx,int vidx1)
	{		
		if(arr[vidx]!=arr[vidx1])
		{
			return false;
		}
		if(vidx>arr.length/2 && vidx1<arr.length/2)
		{
		return true;
		}
//		else
//		if(arr[vidx]==arr[vidx1])
//		{
//			palin(arr,vidx+1,vidx1-1);
//		}
		boolean ans=palin(arr,vidx+1,vidx1-1);
		return ans;		
	}
}
