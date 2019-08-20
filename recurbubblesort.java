package june21;

public class recurbubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={33,55,11,22,44};
		bubble(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		displaybtr(ar1,0);

	}
	public static void bubble(int[] arr,int si,int li)
	{
		if(li==0)
		{
			return;
		}
		if(si==li)
		{
			bubble(arr,0,li-1);
			return;
		}
		if(arr[si]>arr[si+1])
		{
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		bubble(arr,si+1,li);
	}
	public static void displaybtr(int[] ar1,int vidx)
	{
//		bubble(arr,vidx);
		if(vidx==ar1.length)
		{
			return;
		}
		System.out.println(ar1[vidx]);
		displaybtr(ar1,vidx+1);
	}

}
