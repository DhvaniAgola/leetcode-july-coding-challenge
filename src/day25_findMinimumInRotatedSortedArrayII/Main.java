package day25_findMinimumInRotatedSortedArrayII;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 5, 6, 7, 0, 1, 2 };
		FindMinimum findMinimum = new FindMinimum();
		int ans = findMinimum.findMin(input);
		System.out.println(ans);
	}

}
