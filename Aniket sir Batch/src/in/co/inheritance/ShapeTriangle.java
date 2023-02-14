package in.co.inheritance;

public class ShapeTriangle extends Shape1{
 
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area()
	{
	return (height*base)/2;
	}
}
