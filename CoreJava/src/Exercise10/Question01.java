package Exercise10;

public class Question01 {

	public static void main(String[] args) {
	   int a= 10;
	   int b= 0;
	   try {
		double div=a/b;
	} catch (Exception e) {
		System.out.println();
		System.out.println("divide by zero");
		System.out.println(e.getMessage());
		
		System.out.println(e.toString());


	}
	  
	}

}
