
import java.util.Scanner;

public class finddata {
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={55,11,44,22,33};
		System.out.println("enter the number");
		int a=scn.nextInt();
		boolean b=find(arr,0,a);
		System.out.println(b);
        
	}
	public static boolean find(int[] arr,int vidx,int a)
	{
		if(vidx==arr.length)
		{
			return false;
		}
//		find(arr,vidx+1,a);
		if(arr[vidx]==a)
		{
			return true;
		}
		boolean ans = find(arr,vidx+1,a);
		return ans;
		
	}

}
