package day23_singleNumberIII;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 1, 3, 2, 5 };
		SingleNumber sn = new SingleNumber();
		int arr[] = sn.singleNumber(input);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
