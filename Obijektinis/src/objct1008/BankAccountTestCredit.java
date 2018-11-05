package objct1008;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTestCredit {
	   @Test
	   public void shouldHaveAccountNumber(){
	       CreditBankAccount naujas = new CreditBankAccount("Lt121", 100);
	       assertEquals("Lt121", naujas.getNumber());
	   }
	   @Test
	   public void ShouldAllowDepositing(){
	       CreditBankAccount naujas = new CreditBankAccount("Lt121", 0);
	       naujas.credit(100);
	       assertEquals(100, naujas.getBalance(), 0.01);
	   }
	   @Test
	   public void ShouldNotAllowDepositingNegative(){
	       CreditBankAccount naujas = new CreditBankAccount("Lt121", 0);
	       naujas.credit(-100);
	       assertEquals(0, naujas.getBalance(), 0.01);
	   }
	   @Test
	   public void WithrawMoney(){
	       CreditBankAccount naujas = new CreditBankAccount("Lt121", 0);
	       naujas.credit(100);
	       naujas.debit(80);
	       assertEquals(20, naujas.getBalance(), 0.01);

	   }
	   @Test
	   public void shouldAllowWithrawalUptoLimit(){
	       CreditBankAccount naujas = new CreditBankAccount("Lt121", 100);
	       naujas.debit(60);
	       assertEquals(-60, naujas.getBalance(), 0.01);

	   }
}