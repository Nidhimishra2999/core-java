package in.co.polymorphism;

public class CircleP extends ShapeP{
 int radius;

public int getRadius() {
	return radius;
}

public CircleP(int radius) {
	super();
	this.radius = radius;
}

@Override
public double area() {
	// TODO Auto-generated method stub
	System.out.println("radius is-"+ radius);
	return super.area();
}

}