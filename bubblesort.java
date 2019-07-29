
import java.util.Scanner;
public class bubblesort 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={55,33,44,11,22};
//		display(arr);
		bsort(arr);
		display(arr);
	}
	public static void bsort(int[] arr)
	{
		int counter=1;
		while(counter<=arr.length)
		{
			for(int i=0;i<arr.length-counter;i++)
			{
				if(arr[i]>arr[i+1])
				{
					swap(arr,i+1,i);
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
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
