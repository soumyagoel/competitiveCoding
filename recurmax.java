package june21;

public class recurmax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={55,11,44,22,33};
		int a=max(arr,0);
		System.out.println(a);

	}
	public static int max(int[] arr,int vidx)
	{
		if(vidx==arr.length)
		{
			return Integer.MIN_VALUE;
		}
		int m=max(arr,vidx+1);
		if(m<arr[vidx])
		{
			m=arr[vidx];
		}
		return m ;
		
	}

}
