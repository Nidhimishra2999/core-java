package in.co.basics;

public class TryCarTravel {
	String carcolour;
	int speed;
	String No_of_Gears;

	public String getCarcolour() {
		return carcolour;
	}

	public void setCarcolour(String carcolour) {
		this.carcolour = carcolour;
	}

	public int getSpeed() {
		if (speed>=100) {
			System.out.println("speed of the car is :-" + speed);
		} else
			System.out.println("warning");

		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getNo_of_Gears() {

		return No_of_Gears;
	}

	public void setNo_of_Gears(String no_of_Gears) {
		No_of_Gears = no_of_Gears;
	}

}
