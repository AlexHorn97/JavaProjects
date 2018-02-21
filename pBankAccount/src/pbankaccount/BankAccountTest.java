package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount();
		assertEquals(0,acc.getBalance(),0.00001);
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(50,acc.getBalance(),0.00001);
	}

	@Test
	void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(50);
		assertEquals(50,50,0.00001);
	}
	@Test
	void testWithdrawWithPenalty( ) {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(150);
		assertEquals(-50,acc.getBalance(),0.00001);
	}
	@Test
	void testAddInterest() 
	{
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.addInterest();
		assertEquals(1033.5,acc.getBalance(),0.0001);
	}
}
