package june12;

import java.util.Scanner;

public class max {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeinput();
int max= max(arr);
		
		System.out.println("max is"+max);
	}
	public static int[] takeinput()
	{
		System.out.println("enter the size");
		int n=scn.nextInt();
		int[] rv=new int[n];
		for(int i=0;i<rv.length;i++)
		{
			System.out.println("enter the value");
			rv[i]=scn.nextInt();
		}
		
		return rv;
		
	}
	public static int max(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
		return max;
	}

	}

