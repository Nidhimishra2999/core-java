package in.co.basics;

public class Testsimpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simpleinterest si=new Simpleinterest(10000, 5,5.9f);
	   System.out.println(si.getprincipal());
	   System.out.println(si.getrate());
	   System.out.println(si.gettime());
	   double p=si.getprincipal();
	   int  r=si.getrate();
	   float f=si.gettime();
	System.out.println((p*r*f)/100);
	
	}

}
