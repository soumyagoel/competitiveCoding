package june28;

import java.util.Scanner;

public class nKnights {

	/**
	 * @param args
	 */
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		// TODO Auto-generated method stub
		System.out.println("enter no. of rows and columns");
		int n = scn.nextInt();
		boolean[][] arr = new boolean[n][n];
		nKnight(arr, 0, "");

	}

	public static void nKnight(boolean[][] board, int qpsf, String ans) {
		if (qpsf == board.length) {
			System.out.println(ans);
			return;
		}
		int row = qpsf;
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col) == true) {
				board[row][col] = true;
				nKnight(board, qpsf + 1, ans + "[" + row + "-" + col + "]");
				board[row][col] = false;
			}
		}
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r = row;
		int c = col;
		for (c = col; c < board[0].length; c++) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
		}
		for (r = row; r < board.length; r++) {
			for (c = 0; c < board[0].length; c++) {
				if (board[r][c] == true) {
					return false;
				}
			}
		}
		return true;
	}
}
