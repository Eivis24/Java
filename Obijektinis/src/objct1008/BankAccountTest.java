package objct1008;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	public void accountShouldHaveNumber(){
		//creates new bank account
		BankAccount bankAccount = new BankAccount("LT123");
//		bankAccount.number ="LT123";
//		bankAccount.number ="LT123";
		assertEquals("LT123", bankAccount.getNumber());
		
	}
	@Test
	public void diferantBankAccountShowIndividualNumbers() {
		BankAccount bankAccount1 = new BankAccount("LT1");
		BankAccount bankAccount2 = new BankAccount("LT2");
		
//		bankAccount1.number ="LT1";
//		bankAccount2.number ="LT2";
		assertEquals("LT1", bankAccount1.getNumber());
		assertEquals("LT2", bankAccount2.getNumber());
	}
	@Test
	public void accountShouldHaveABalance() {
		BankAccount bankAccount = new BankAccount("");
		bankAccount.credit(1.0);
		assertEquals(1.0, bankAccount.getBalance());
	}
	@Test
	public void accountBalanceShouldOnlyBePositive() {
		BankAccount bankAccount1 = new BankAccount("");
		bankAccount1.credit (-1.0);
		assertEquals(0.0, bankAccount1.getBalance());
	}
}
