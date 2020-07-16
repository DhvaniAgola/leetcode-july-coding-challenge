package day15_reverseWordsInString;

public class ReverseWords {
	public String reverseWords(String s) {
		String result = "";
		String wordsArr[] = s.split(" ");
		String check;
		for (int i = wordsArr.length - 1; i >= 0; i--) {
			check = wordsArr[i].trim();
			if (!check.equalsIgnoreCase(""))
				result += check + " ";
		}
		return result.trim();
	}
}
