package day28_taskScheduler;

public class CalculateTotalTime {
	public int leastInterval(char[] tasks, int n) {
		int result = 0;
		int arr[] = new int[n + 1];
		int arrMain[] = new int[26];
		int j = 0, i = 0;
		int max = 0;
		int maxindex = 0;
		for (i = 0; i < tasks.length; i++) {
			arrMain[tasks[i] - 65]++;
		}
		
		for (i = 0; i < arr.length; i++) {
			max = arrMain[0];
			maxindex = 0;
			for (j = 0; j < arrMain.length; j++) {
				if (arrMain[j] > max) {
					max = arrMain[j];
					maxindex = j;
				}
			}
			arr[i] = max;
			arrMain[maxindex] = 0;
		}

		result = (arr[0] - 1) * (n + 1) + 1;
		for (i = 1; i < n + 1; i++) {
			if (arr[i] == arr[0])
				result++;
		}
		if ((tasks.length - arr[0]) > ((arr[0] - 1) * n))
			if (result < tasks.length)
				result = tasks.length;
		return result;
	}
}
