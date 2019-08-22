
public class recurrev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={55,11,44,22,33};
		rev(arr,0);

	}
	public static void rev(int[] arr,int vidx)
	{
		if(vidx==arr.length)
		{
			return;
		}
		rev(arr,vidx+1);
		System.out.println(arr[vidx]);
	}

}
