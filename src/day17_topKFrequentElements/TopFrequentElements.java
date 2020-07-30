package day17_topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		int[] output = new int[k];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		int max = 0;
		int key = 0;
		for (int i = 0; i < k; i++) {
			max = 0;
			for (int j : map.keySet()) {
				if (map.get(j) > max) {
					max = map.get(j);
					key = j;
				}
			}
			map.remove(key);
			output[i] = key;
		}
		return output;
	}

	public int[] topKFrequent2(int[] nums, int k) {
		int[] output = new int[k];
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		Arrays.sort(nums);
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
				continue;
			}
			updateMap(++count, nums[i - 1], map);
			count = 0;
		}
		updateMap(++count, nums[nums.length - 1], map);
		List<Integer> lstTemp = new ArrayList<>(map.keySet());
		Collections.sort(lstTemp);
		int m = 0;
		l1: for (int i = lstTemp.size() - 1; i >= 0; i--) {
			for (int j : map.get(lstTemp.get(i))) {
				if (m >= k)
					break l1;
				output[m] = j;
				m++;
			}
		}

		return output;
	}

	private void updateMap(int count, int i, HashMap<Integer, List<Integer>> map) {
		// TODO Auto-generated method stub
		List<Integer> lst;
		if (map.containsKey(count))
			lst = map.get(count);
		else
			lst = new ArrayList<>();
		lst.add(i);
		map.put(count, lst);
	}
}
