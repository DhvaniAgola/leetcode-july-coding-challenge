package day17_topKFrequentElements;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopFrequentElements topFrequentElements = new TopFrequentElements();
		int input[] = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int output[] = new int[k];
		output = topFrequentElements.topKFrequent2(input, k);
		for (int i = 0; i < k; i++)
			System.out.println(output[i]);
	}

}
