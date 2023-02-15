package in.co.basics;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Shaswat");
		p.setDOB("03/04/2000");
		p.setAdress("Indore");
		
		System.out.println(p.getName());
		System.out.println(p.getDOB());
		System.out.println(p.getAdress());
	}

}
