package june14;

import java.util.Scanner;

public class waverow {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of two-d array");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] ar=input(n,m);
		display( ar,n,m);

	}
	public static int[][] input(int n,int m)
	{
		int[][] arr=new int[n][m];
		System.out.println("enter the array");
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<m;col++)
			{
				arr[row][col]=scn.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr,int n,int m)
	{
		for(int row=0;row<n;row++)
		{
			if(row%2==0)
			{
				for(int col=0;col<m;col++)
				{
					System.out.print(arr[row][col]+"\t");
				}
			}
			else
			{
				for(int col=m-1;col>=0;col--)
				{
					System.out.print(arr[row][col]+"\t");
				}
			}
		}
	}

}
