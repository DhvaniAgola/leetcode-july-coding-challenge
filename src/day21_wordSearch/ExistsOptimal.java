package day21_wordSearch;

public class ExistsOptimal {

	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && findString(i, j, board, word, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean findString(int i, int j, char[][] board, String word, int index) {

		if (index >= word.length() - 1) {
			return true;
		}
		board[i][j] -= 65;
		if (j < board[0].length - 1 && (word.charAt(index + 1) == board[i][j + 1])
				&& findString(i, j + 1, board, word, index + 1))
			return true;

		if (j > 0 && (word.charAt(index + 1) == board[i][j - 1]) && findString(i, j - 1, board, word, index + 1))
			return true;

		if (i > 0 && (word.charAt(index + 1) == board[i - 1][j]) && findString(i - 1, j, board, word, index + 1))
			return true;

		if (i < board.length - 1 && (word.charAt(index + 1) == board[i + 1][j])
				&& findString(i + 1, j, board, word, index + 1))
			return true;
		board[i][j] += 65;
		return false;

	}

}
