package in.co.basics;

public class TestBankAccount {

	public static void main(String[] args) {
		 BankAccount ba = new BankAccount();
		 ba.setAc_number("1720010059456");
		 ba.setAc_type("Savings");
		 ba.setBalance(10000);
		 ba.setDeposit(100);
		 ba.setWithdrawl(5000);
		 
		 System.out.println(ba.getAc_number());
		 System.out.println(ba.getAc_type());
		 System.out.println(ba.getBalance());
		 System.out.println("deposit:- "+ba.getDeposit());
		 //System.out.println(ba.getWithdrawl());
	}

}
