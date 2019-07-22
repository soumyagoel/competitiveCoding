package june12;

import java.util.Scanner;

public class inverse {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeinput();
//		int[] m=new int[arr.length];
		display(arr);
		int[] res=inverse(arr);
//	display(res);
       Boolean result=check(arr,res);
       System.out.println(result);
        
		
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
	public static int[] inverse(int[] arr){
		int[] m=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i]==j)
			{
				m[j]=i;
			break;
			}

			}
		}
		return m;

		
	
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	public static Boolean check(int[] arr,int[] m)
	{		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length;j++)
				{
			if(arr[i]==m[j])
			{
				return true;
			}
			else
			{
				return false;
			}
		
				}
		}
		return false;
	}

	}



