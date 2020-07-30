package day28_taskScheduler;

/**
 * Your runtime beats 99.81 % of java submissions.
 * 
 * @author dhvaniagola
 *
 *         Your memory usage beats 31.16 % of java submissions.
 */
public class CalculateTotalTime_FASTEST {
	public int leastInterval(char[] tasks, int n) {
		int result = 0;
		int arrMain[] = new int[26];
		int i = 0;
		int max = 0;
		for (i = 0; i < tasks.length; i++) {
			arrMain[tasks[i] - 65]++;
		}

		for (i = 0; i < arrMain.length; i++) {
			if (arrMain[i] > max)
				max = arrMain[i];
		}
		int maxCount = 0;
		for (i = 0; i < arrMain.length; i++) {
			if (arrMain[i] == max)
				maxCount++;
		}

		result = (max - 1) * (n + 1) + 1;
		if (maxCount - 1 <= n)
			result += maxCount - 1;
		else
			result += n;

		if ((tasks.length - max) > ((max - 1) * n))
			if (result < tasks.length)
				result = tasks.length;
		return result;
	}
}
