package in.co.inheritance;

public class TestSRTC {

	public static void main(String[] args) {
		ShapeRectangle sr = new ShapeRectangle();
		ShapeTriangle st = new ShapeTriangle();
		ShapeCircle sc = new ShapeCircle();

		sr.setLength(20);
		sr.setWidth(20);
		System.out.println(sr.area());

		st.setHeight(10);
		st.setBase(20);
		System.out.println(st.area());
		
		sc.setRadius(20);
		System.out.println(sc.area());

	}
	
}
