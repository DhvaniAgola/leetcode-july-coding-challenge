package day28_taskScheduler;

public class Main {

	public static void main(String[] args) {
		char[] input = { 'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		int interval = 2;
		CalculateTotalTime_FASTEST calculateTotalTime = new CalculateTotalTime_FASTEST();
		int output = calculateTotalTime.leastInterval(input, interval);
		System.out.println(output);
	}

}
