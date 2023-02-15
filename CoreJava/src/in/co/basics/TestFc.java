package in.co.basics;

public class TestFc {

	public static void main(String[] args) {
		FirstClass f = new FirstClass();
		
		f.setLength(50);
		f.setBreadth(10);
		
		System.out.println("Area of Rectagle:- "+f.getLength()*f.getBreadth());

	}

}
