package june16;

import java.util.Scanner;

public class matrixmulti {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int[][] arr1=new int[N][N];
		int[][] arr2=new int[N][N];
		int[][] arr3=new int[N][N];
		int[][] ar1=input(N);
		int[][] ar2=inp(N);
		multi(ar1,ar2,N);
//		int[][] ar3=multi(ar1,ar2,N);
//        display(ar3,N); 
	}
	public static int[][] input(int N)
	{
		int[][] arr1=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr1[i][j]=scn.nextInt();
			}
		}
		return arr1;
	}
	public static int[][] inp(int N)
	{
		int[][] arr2=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr2[i][j]=scn.nextInt();
			}
		}
		return arr2;
	}
	public static void multi(int[][] arr1,int[][] arr2,int N)
	{
		int[][] arr3=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
//				arr3[i][j]=0;
				for(int k=0;k<N;k++)
				{
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
//		return arr3;
	}
	public static void display(int[][] arr3,int N)
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
