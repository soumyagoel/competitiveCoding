
import java.util.Scanner;
public class subsets 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3};              
		subs(arr);
	}
	public static void subs(int[] arr)
	{
		int t=(int)Math.pow(2,arr.length);                     //	subsets
		int count=0;
		while(count<t)
		{
			System.out.print("[");
			int temp=count;
			for(int i=0;i<arr.length;i++)
			{
			int rem=temp%2;
			if(rem==1)
			{
				System.out.print(arr[i]+" , ");
			}
			temp=temp/2;
			}
			count++;
		    System.out.print("]");
		}
	}
}
