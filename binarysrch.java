package june14;

import java.util.Scanner;

public class binarysrch {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50,60,70,80,90};
		int result=binarysrch(arr,50);
		System.out.println(result);
	}
	public static int binarysrch(int[] arr,int data)
	{
		int mid;
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
		if(arr[mid]==data)
		{
			return(mid);
		}
		else if(arr[mid]<data)
		{
			low=mid+1;
		}
		else
			if(arr[mid]>data)
			{
				high=mid-1;
			}
		
		}
		return -1;

	}

}
