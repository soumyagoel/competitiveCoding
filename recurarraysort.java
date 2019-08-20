
public class recurarraysort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr={55,33,11,44,22};
		int[] arr={11,22,33,44,55};
//		int[] arr={55,44,33,22,11};
		boolean b=sort(arr,0);
		System.out.println(b);

	}
	public static boolean sort(int[] arr,int vidx)
	{
		for(int i=1;i<arr.length;i++)
		{
		if(arr[vidx]<arr[i])
		{
			return true;
		}
		else
		{
			return false;
		}
		}
		boolean ans=sort(arr,vidx+1);
		return ans;
		
	}

}
