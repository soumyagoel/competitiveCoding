package june14;

import java.util.Scanner;

public class targetd {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		int n=scn.nextInt();
		System.out.println("enter target");
		int tar=scn.nextInt();
		int[] ar=input(n);
		tard(ar,tar,n);

	}
	public static int[] input(int n)
	{
		int[] arr=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void tard(int[] arr ,int tar ,int n)
	{
		int sum;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==tar)
				{
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
	}

}
