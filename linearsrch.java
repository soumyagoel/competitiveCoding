

import java.util.Scanner;

public class linearsrch {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeinput();
		linear(arr);
		
	}
	public static int[] takeinput()
	{
		System.out.println("enter the size");
		int n=scn.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the value");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		return arr;
		
	}
	public static void linear(int []arr){
		System.out.println("enter the value to be search");
		int val=scn.nextInt();
		int i;
		for( i=0;i<arr.length;i++)
		{
	    if(val==arr[i])
	    {
	    	val=arr[i];
	    	break;
	    }
		}
		System.out.print("value found at  "+i+" is "+val);
	
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

	}


