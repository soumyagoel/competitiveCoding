package june14;

import java.util.Scanner;

public class sumofarray {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of one array");
		int n=scn.nextInt();
		System.out.println("enter the size of another array");
		int m=scn.nextInt();
		int[] array1=input(n);
		int[] array2=inp(m);
		sumtwo(array1,array2,n,m);
		}
	public static int[] input(int n)
	{
		int[] one=new int[n];
		for(int i=0;i<n;i++)
		{
			one[i]=scn.nextInt();
		}
		return one;
	}
	public static int[] inp(int m)
	{
		int[] two=new int[m];
		for(int i=0;i<m;i++)
		{
			two[i]=scn.nextInt();
		}
		return two;
	}
	public static void sumtwo(int[] one , int[] two ,int n,int m)
	{
		int p=((m>n)?(m+1):(n+1));
		int[] sum=new int[p];
		int carry=0;
		int i=n-1;
		int j=m-1;
		int k=p-1;
		while(k>=0)
		{
			int s=carry;
			if(i>=0)
			{
				s=s+one[i];
			}
			if(j>=0)
			{
				s=s+two[j];
			}
			sum[k]=s%10;
			carry=s/10;
			i--;
			j--;
			k--;
		}
		for( k=0;k<p;k++)
		{
			if(k==0&&sum[k]==0)
			{
				continue;
			}
			System.out.print(sum[k]+"  ");
		}
	}

}
