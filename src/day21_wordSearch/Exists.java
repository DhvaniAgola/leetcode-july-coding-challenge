package day21_wordSearch;

public class Exists {
	boolean b = false;

	public boolean exist(char[][] board, String word) {
		int width = board.length == 0 ? 0 : board[0].length;
		int leng = board.length;
		int[][] dp = new int[leng][width];
		for (int i = 0; i < leng; i++)
			for (int j = 0; j < width; j++)
				dp[i][j] = -1;
		for (int i = 0; i < leng; i++) {
			for (int j = 0; j < width; j++) {
				if (board[i][j] == word.charAt(0) && !b) {
					findString(i, j, dp, board, word, 0, width, leng);
					dp[i][j] = -1;
				}
			}
		}
		return b;
	}

	public void findString(int i, int j, int[][] dp, char[][] board, String word, int index, int width, int leng) {
		// TODO Auto-generated method stub
		dp[i][j] = 0;
		if (index >= word.length() - 1) {
			b = true;
			return;
		}
		if (!b && j < width - 1 && (word.charAt(index + 1) == board[i][j + 1]) && dp[i][j + 1] == -1) {
			findString(i, j + 1, dp, board, word, index + 1, width, leng);
			dp[i][j + 1] = -1;
		}

		if (!b && j > 0 && (word.charAt(index + 1) == board[i][j - 1]) && dp[i][j - 1] == -1) {
			findString(i, j - 1, dp, board, word, index + 1, width, leng);
			dp[i][j - 1] = -1;
		}

		if (!b && i > 0 && (word.charAt(index + 1) == board[i - 1][j]) && dp[i - 1][j] == -1) {
			findString(i - 1, j, dp, board, word, index + 1, width, leng);
			dp[i - 1][j] = -1;
		}

		if (!b && i < leng - 1 && (word.charAt(index + 1) == board[i + 1][j]) && dp[i + 1][j] == -1) {
			findString(i + 1, j, dp, board, word, index + 1, width, leng);
			dp[i + 1][j] = -1;
		}

	}
}
