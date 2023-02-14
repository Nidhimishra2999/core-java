package in.co.clonning;

public class DeepClonning {
	public static void main(String[] args) throws Exception {
		
		Customer c1 = new Customer("Nidhi");
		
		Customer c2= (Customer) c1.clone();
	
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}

}
