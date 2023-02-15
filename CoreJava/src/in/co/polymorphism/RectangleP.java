package in.co.polymorphism;

public class RectangleP extends ShapeP {

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = length * width;
		System.out.println("Rectangle_area="+ area);
		return super.area();
		// System.out.println(area);
	}

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public RectangleP(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	{

	}

}
