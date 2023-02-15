package in.co.basics;

public class BankAccount {
	
	private String ac_number;
	private String ac_type;
	private double balance;
	private double deposit ;
	private double withdrawl;
	private double transfer;
	private double pay_bill;
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit+balance;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void getWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	
	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	public double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}
	public double getPay_bill() {
		return pay_bill;
	}
	public void setPay_bill(double pay_bill) {
		this.pay_bill = pay_bill;
	}
	
	
	
	
	
	
}
