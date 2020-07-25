package day25_findMinimumInRotatedSortedArrayII;

public class FindMinimum {
	int findMin(int[] nums) {
		int output = nums[0];
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] > nums[i + 1]) {
				output = nums[i + 1];
				break;
			}

		return output;
	}
}
