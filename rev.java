
import java.util.Scanner;

public class rev {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeinput();
		display(arr);
rev(arr);
		
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
	public static void rev(int []arr){
		System.out.print("reverse is  ");
		for(int i=0;i<arr.length;i++)
		{
	     int left=0;
	     int right=arr.length-1;
	     if(left<right)
	     {
	    	 int temp=arr[left];
	    	 arr[left]=arr[right];
	    	 arr[right]=temp;
	    	 left++;
	    	 right--;
	    	
	     }
	     
		System.out.print(arr[i]+" ");
		}
	
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

	}


