package june21;
public class recurinverse 
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr={5,2,1,0,3,4};
		inverse(arr,0);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void inverse(int[] arr,int si)
	{
		if(si==arr.length)
		{
			return;
		}
		int ele=arr[si];
		inverse(arr,si+1);
		arr[ele]=si;
//		inverse(arr,si+1);
	}
}
