package june16;

import java.util.Scanner;

public class shellrotate {

	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] arr={{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45}};
		int k= scn.nextInt();
		int r=scn.nextInt();
		shell(arr,k,r);

	}
	public static void shell(int[][] arr,int k,int r)
	{
		int rmin=k-1;
		int cmin=k-1;
		int rmax=arr.length-k;
		int cmax=arr[0].length-k;
		int count=0;
		int col=cmin;
		int row=rmin;
		int val=2*(cmax+rmax-cmin-rmin);
		int[] c=new int[val];
//		int i=0;
		while(count<val)
		{
		for(row=rmin;count<=val&&row<=rmax;row++)
		{
			c[count]=arr[row][cmin];
//			i++;
			count++;
		}
		cmin++;		
		for(col=cmin;count<=val&&col<=cmax;col++)
		{
			c[count]=arr[rmax][col];
//			i++;
			count++;
		}
		rmax--;
		
		for(row=rmax;count<=val&&row>=rmin;row--)
		{
			c[count]=arr[row][cmax];
//			i++;
			count++;
		}
		cmax--;
		
		for(col=cmax;count<=val&&col>=cmin;col--)
		{
			c[count]=arr[rmin][col];
//			i++;
			count++;
		}
		rmin++;
		}
		rotate(c,r);
	}
	public static void rotate(int[] arr,int r)
	{
		int[] rot=new int[arr.length];
		r=r%arr.length;
		if(r<0)
		{
			r=arr.length+r;
		}
		int ridx=0;
		for(int i=arr.length-r;i<arr.length;i++)
		{
			rot[ridx]=arr[i];
			ridx++;
		}
		for(int i=0;i<arr.length-r;i++)
		{
			rot[ridx]=arr[i];
			ridx++;
		}
		for(int i=0;i<rot.length;i++)
		{
			System.out.print(rot[i]+"  ");
		}
		
	}

}

