package in.co.polymorphism;

public class TriangleP extends ShapeP{
 int base;
 int height;
public int getBase() {
	return base;
}
public int getHeight() {
	return height;
}
public TriangleP(int base, int height) {
	super();
	this.base = base;
	this.height = height;
}
@Override
public double area() {
	double area = (base*height)/2;
	System.out.println(area);
	return super.area();
}
}

