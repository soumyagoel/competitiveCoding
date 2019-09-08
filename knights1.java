package june28;

public class knights1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		knights(0, 0, 0, "", new boolean[4][4]);
	}

	public static void knights(int row, int col, int knpsf, String asf,
			boolean board[][]) {

		if (knpsf == board.length) {
			System.out.println(asf);
			return;
		}

		for (int c = col; c < board.length; c++) {
			if (isitsafe(row, c, board)) {
				board[row][c] = true;
				knights(row, c + 1, knpsf + 1, asf + "[" + row + "," + c + "]",
						board);
				board[row][c] = false;
			}
		}

		for (int r = row + 1; r < board.length; r++) {
			for (int c = 0; c < board.length; c++) {

				if (isitsafe(r, c, board)) {
					board[r][c] = true;
					knights(r, c + 1, knpsf + 1, asf + "[" + r + "," + c + "]",
							board);
					board[r][c] = false;
				}
			}
		}

	}

	public static boolean isitsafe(int row, int col, boolean board[][]) {

		if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1]) {
			return false;
		}

		if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
			return false;
		}

		if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
			return false;
		}

		if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2]) {
			return false;
		}

		return true;
	}

}
