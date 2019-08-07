
import java.util.Scanner;

public class targett {

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
	
	public static void selsort(int[] arr)
	{
		int counter=1;
		while(counter<=arr.length)
		{
			for(int i=counter;i<=arr.length-1;i++)
			{
				if(arr[counter-1]>arr[i])
				{
					swap(arr,counter-1,i);
				}
			}
			counter++;
		}
	}
	public static void swap(int[] arr,int j,int i)
	{
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	
	public static void tard(int[] arr ,int tar ,int n)
	{
		selsort(arr);
		int sum;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
				sum=arr[i]+arr[j]+arr[k];
				if(sum==tar)
				{
					System.out.println(arr[i]+" , "+arr[j]+" , "+arr[k]);
				}
				}
			}
		}
	}

}
