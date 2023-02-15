package in.co.Exception;

public class TestLogin {

	public static void main(String[] args) {
		String name = "Admi";
		if (name == "Admin") {
			System.out.println("Valid");
		} else {
			try {
				throw new Login();
			} catch (Exception e) {
				System.out.println("Hello");
				System.out.println(e.getMessage());
			}
		}

	}

}
//150-170 page
// interface collection
//list interface