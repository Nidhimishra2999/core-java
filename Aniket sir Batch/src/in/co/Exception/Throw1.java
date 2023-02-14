package in.co.Exception;

public class Throw1 {
	public static void main(String[] args) {
		int k = 0;
		int i = 15;
		//System.out.println("Before Exception");

		try {
			double d = i / k;
		} catch (ArithmeticException e) {

			System.out.println("after Exception");
			//System.out.println(d);
		}
	}

}
