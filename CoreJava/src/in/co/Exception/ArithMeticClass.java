package in.co.Exception;

public class ArithMeticClass {

	public static void main(String[] args) {
		int k = 0;
		int i = 15;
		try {
			double div = i / k;

		} catch (Exception b) {
			
			System.out.println("divide by zero");
			System.out.println(b.getMessage());
			b.printStackTrace();
			System.out.println(b.toString());

		}

	}

}
