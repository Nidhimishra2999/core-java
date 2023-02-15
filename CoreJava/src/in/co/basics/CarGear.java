package in.co.basics;

public class CarGear {
	String color;
	int speed;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed()
	{
		if(speed>=100)
		{
			System.out.println("warning:-" +"becarefull to drive");
	    }
		else
			System.out.println("have a happy journey");
		
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
