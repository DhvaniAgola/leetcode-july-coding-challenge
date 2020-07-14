package day14_angleBetweenHandsOfClock;

public class Angles {
	public double angleClock(int hour, int minutes) {
		hour = hour % 12;
		double minute_angle = minutes * 360 / 60;
		double hours_angle = ((double) 360 / (double) 12) * hour;
		hours_angle += ((double) 360 / (double) (12 * 60)) * minutes;
		return Math.min(Math.max(minute_angle, hours_angle) - Math.min(minute_angle, hours_angle),
				360 - (Math.max(minute_angle, hours_angle) - Math.min(minute_angle, hours_angle)));

	}
}
