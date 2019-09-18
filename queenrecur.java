
import java.util.Scanner;

public class queenrecur 
{
	/**
	 * @param args
	 */
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter no. of rows and columns");
		int n=scn.nextInt();
		boolean[][] arr=new boolean[n][n];
		queen(arr,0,"");
		
	}
	public static void queen(boolean[][] board,int qpsf,String ans)
	{
		if(qpsf==board.length)
		{
			System.out.println(ans);
			return;
		}
		int row=qpsf;
		for(int col=0;col<board[0].length;col++)
		{
			if(isItSafe(board,row,col)==true)
			{
				board[row][col]=true;
				queen(board,qpsf+1,ans+"["+row+"-"+col+"]");
				board[row][col]=false;
			}
		}
	}
	public static boolean isItSafe(boolean[][] board,int row,int col)
	{
		int r=row;
		int c=col;
//		check vertical
		while(r>=0)
		{
			if(board[r][col]==true)
			{
				return false;
			}
			r--;
		}
//		check +ve diag
		r=row;
		c=col;
		while(r>=0&&c<board.length)
		{
			if(board[r][c]==true)
			{
				return false;
			}
			r--;
			c++;
		}
//		check -ve diag
		r=row;
		c=col;
		while(r>=0&&c>=0)
		{
			if(board[r][c]==true)
			{
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
}
