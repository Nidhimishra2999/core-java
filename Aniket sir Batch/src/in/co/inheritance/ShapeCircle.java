package in.co.inheritance;

public class ShapeCircle extends Shape1 {
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.14*radius*radius;

	}

}
