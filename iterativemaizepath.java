package july5;

import java.util.Arrays;

public class iterativemaizepath {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = iterative(0, 0, 3, 3);
//		System.out.println(a);
		int b=sw(3,3);
		System.out.println(b);
	}

	public static int iterative(int cr, int cc, int er, int ec) {
		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {

				} else if (row == er) {
					strg[row][col] = strg[row][col + 1];
				} else if (col == ec) {
					strg[row][col] = strg[row + 1][col];
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}
		}
		return strg[0][0];
	}
	public static int sw(int er,int ec)
	{
		int[] strg=new int[ec+1];
		Arrays.fill(strg,1);
		for(int row=er-1;row>=0;row--)
		{
			for(int col=ec-1;col>=0;col--)
			{
				int nv=strg[col]+strg[col+1];
				strg[col]=nv;
			}
		}
		return strg[0];
	}
}
