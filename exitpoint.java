package june14;
public class exitpoint 
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] arr={{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
		exitpoint(arr);
	}
	public static void exitpoint(int[][] arr)
	{
	      int row=0;
	      int col=0;
				int dir=0;
				while(true)
				{
					dir=(dir+arr[row][col])%4;
					if(dir==0)
					{
						col++;
						if(col==arr[0].length)
						{
							System.out.println(row+" , "+(col-1));
							break;
						}
					}
					else if(dir==1)
					{
						row++;
						if(row==arr.length)
						{
							System.out.println((row-1)+" , "+col);
							break;
						}
					}
					else if(dir==2)
					{
						col--;
						if(col==-1)
						{
							System.out.println(row+" , "+0);
							break;
						}
					}
					else if(dir==3)
					{
						row--;
						if(row==-1)
						{
							System.out.println(0+" , "+col);
							break;
						}
					}
				}
			}	
	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[0].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}