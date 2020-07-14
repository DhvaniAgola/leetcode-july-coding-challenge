package day14_angleBetweenHandsOfClock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours = 3;
		int minutes = 30;
		Angles angles=new Angles();
		double answer = angles.angleClock(hours, minutes);
		System.out.println(answer);
	}

}
