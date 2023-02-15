package in.co.basics;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.setR(5);
		c.setPie(3.14f);
		
		System.out.println(c.getPie()*c.getR()*c.getR());

	}

}
