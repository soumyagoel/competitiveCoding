
import java.util.Scanner;

public class firstindx {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr={3,7,4,7,7};
       System.out.println("enter the number");
       int b=scn.nextInt();
       int a=first(arr,0,b);
       System.out.println(a);
	}
	public static int first(int[] arr,int vidx,int b)
	{
		if(vidx==arr.length)
		{
			return Integer.MIN_VALUE;
		}
		if(b==arr[vidx])
		{
			return vidx;
		}
		int ans=first(arr,vidx+1,b);
		return ans;
	}

}
