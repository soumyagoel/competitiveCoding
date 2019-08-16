
import java.util.Scanner;

public class lastindex {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,7,4,7,7};
		System.out.println("enter the number");
		int b=scn.nextInt();
		int a=last(arr,arr.length-1,b);
		System.out.println(a);

	}
	public static int last(int[] arr,int vidx,int b)
	{
		if(vidx==-1)
		{
			return -1;
		}
		if(b==arr[vidx])
		{
			return vidx;
		}
		int ans=last(arr,vidx-1,b);
		return ans;
	}

}
