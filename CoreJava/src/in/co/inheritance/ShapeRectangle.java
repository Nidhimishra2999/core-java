package in.co.inheritance;

public class ShapeRectangle extends Shape1{
	
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
	public int area()
	{
		return length*width;
	}
	
	}
