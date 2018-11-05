package objct1008;

public class CreditBankAccount {
	private String number;
	private double balance;
	private double creditLimit;
	
	public CreditBankAccount(String number, double creditLimit) {
		this.number = number;	
		this.creditLimit = creditLimit;
	}
	public String getNumber() {
		return this.number;
	}
	public void credit(double amount) {
		if(amount>0) {
			this.balance += amount;	
		}
	}
	 public void debit(double i) {
		 if(this.balance - i>= -this.creditLimit + this.balance) {
		       balance -= i; 
		 }
	   }
	public double getBalance() {
		return this.balance;
	}
}