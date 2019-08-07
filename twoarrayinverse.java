
import java.util.Arrays;
import java.util.Scanner;
public class twoarrayinverse
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter the size of one array");
		int n=scn.nextInt();
		System.out.println("enter the size of another array");
		int m=scn.nextInt();
		int[] array1=input(n);
		int[] array2=inp(m);
		int[] array3=inverse(array1,n);
		
		boolean array4=check(array3,n,m,array2);
		System.out.println(array4);

	}
	public static int[] input(int n)
	{
		int[] arr1=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=scn.nextInt();
		}
		return arr1;
	}
	public static int[] inp(int m)
	{
		int[] arr2=new int[m];
		System.out.println("enter another array");
		for(int i=0;i<m;i++)
		{
			arr2[i]=scn.nextInt();
		}
		return arr2;
	}
	public static int[] inverse(int[] arr1,int n)
	{
	    int[] ar1=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(arr1[i]==j)
	    		{
	    			ar1[j]=i;
	    			break;
	    		}
	    	}
	    }
	    return ar1;
	}
	public static boolean check(int[] ar1,int n,int m,int[] arr2)
	{		
			if(Arrays.equals(ar1, arr2))
			{
				return true;
			}
			return false;
	}
}
	

