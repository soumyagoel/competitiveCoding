
import java.util.Scanner;

public class recurindex 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr={3,7,4,7,7};
		System.out.println("enter the number");
		int b=scn.nextInt();
		int[] a=ind(arr,0,b,0);
//		System.out.println(a);
        displaybtr(a,0);
	}
	public static int[] ind(int[] arr,int vidx,int b,int csf)
	{
		if(vidx==arr.length)
		{
			return new int[csf];
		}
		if(b==arr[vidx])
		{
			int[] rr=ind(arr,vidx+1,b,csf+1);
		    rr[csf]=vidx;
		    return rr;
		}
		else
		{
			int[] rr=ind(arr,vidx+1,b,csf);
			return rr;
		}
		
		
		
	}
	public static void displaybtr(int[] arr,int vidx)
	{
		if(vidx==arr.length)
		{
			return;
		}
		System.out.println(arr[vidx]);
		displaybtr(arr,vidx+1);
	}

}
