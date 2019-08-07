
import java.util.Scanner;
public class spiraldispcol
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr={{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35}};
		spirald(arr);
	}
	public static void spirald(int[][] arr)
	{
		int rmin=0;
		int cmin=0;
		int rmax=arr.length-1;
		int cmax=arr[0].length-1;
		int count=1;
		int tne=arr.length*arr[0].length;
		int row=rmin;
		int col=cmin;
		int dir=0;
		while(count<=tne)
		{
		System.out.print(arr[row][col]+" ");
		count++;
		
			if(dir==0)
			{
				row++;
				if(row>=rmax)
				{
					if(row>rmax)
					{
						row=rmax;
						col++;
					}
					dir++;
				}
			}
			else
				if(dir==1)
				{
					col++;
					if(col>=cmax)
					{
						if(col>cmax)
						{
							col=cmax;
							row++;
						}
						dir++;
					}
				}
				else
					if(dir==2)
					{
						row--;
						if(row<=rmin)
						{
							if(row<rmin)
							{
								row=rmin;
								col--;
							}
							dir++;
						}
					}
					else
						if(dir==3)
						{
							col--;
							if(col<=cmin)
							{
								if(col<cmin)
								{
									col=cmin;
									row--;
								}
								dir=0;
								rmin++;
								cmin++;
								rmax--;
								cmax--;
								row=rmin;
								col=cmin;
							}
						}
		}
	}

}
