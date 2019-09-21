package june30;

import java.util.Scanner;

public class partitionsort {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
	    quicksort(arr,0,arr.length-1);
	    for(int j=0;j<arr.length;j++)
	    {
	    	System.out.println(arr[j]);
	    }

	}
	public static void quicksort(int[] ar1,int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		int mid=(lo+hi)/2;
		int pivot=ar1[mid];
		int left=lo;
		int right=hi;
		while(left<=right)
		{
			while(ar1[left]<pivot)
			{
				left++;
			}
				while(ar1[right]>pivot)
				{
					right--;
				}
		if(left<=right)
		{
			int temp=ar1[left];
			ar1[left]=ar1[right];
			ar1[right]=temp;
			left++;
			right--;
		}
		}
		quicksort(ar1,lo,right);
		quicksort(ar1,left,hi);
		return;
	}

}
