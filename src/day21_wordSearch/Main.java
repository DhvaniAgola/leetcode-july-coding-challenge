package day21_wordSearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
//		char board[][] = { { 'C', 'A', 'A' }, { 'A', 'A', 'A' }, { 'B', 'C', 'D' } };
		char board[][] = { { 'G', 'A', 'A' }, { 'F', 'A', 'B' }, { 'B', 'C', 'D' } };
		ExistsOptimal e = new ExistsOptimal();
		String word = "AAA";
		boolean ans = e.exist(board, word);
		System.out.println(ans);
	}

}
