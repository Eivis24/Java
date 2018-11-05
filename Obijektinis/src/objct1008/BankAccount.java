package objct1008;

public class BankAccount {
	private String number;
	private double balance;
	public BankAccount(String number) {
		this.number = number;	
	}
	public void credit(double amount) {
		if(amount>0) {
			this.balance += amount;	
		}
	}
	public double getBalance() {
		return this.balance;
	}
	public String getNumber() {
		return this.number;
	}
}
