package day23_singleNumberIII;

import java.util.HashMap;

public class SingleNumber {
	public int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.remove(nums[i]);
			else
				map.put(nums[i], 1);
		}
		int[] arr = new int[map.keySet().size()];
		int k = 0;
		for (int i : map.keySet())
			arr[k++] = i;
		return arr;
	}
}
