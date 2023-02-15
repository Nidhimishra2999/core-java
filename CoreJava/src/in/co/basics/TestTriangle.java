package in.co.basics;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.setBase(10);
		t.setHeight(5);
		
		System.out.println((t.getBase()*t.getHeight())/2);
		
	}

}
