package com.capgemini.service;

import org.junit.Test;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public class AccountServiceImplTest {
	@Test(expected = InsufficientInitialAmountException.class)
	public void testCreateAccountShouldFailWhenAmmountLessThan5000() throws InsufficientInitialAmountException, InvalidAccountNumberException{
		Account acc = new Account();
		acc.setAccountNumber(3);
		acc.setAmount(1000);
		AccountService accServ = new AccountServiceImpl();
		accServ.createAccount(acc);
	}
	
	@Test(expected = InvalidAccountNumberException.class)
	public void testCreateAccountShouldFailWhenAccountNumberIsDuplicate() throws InsufficientInitialAmountException, InvalidAccountNumberException{
		AccountService accServ = new AccountServiceImpl();
		Account acc1 = new Account();
		acc1.setAccountNumber(1);
		acc1.setAmount(5000);
		accServ.createAccount(acc1);
		
		Account acc2 = new Account();
		acc2.setAccountNumber(1);
		acc2.setAmount(5000);
		accServ.createAccount(acc1);
	}
	
	@Test
	public void testCreateAccountShouldPass() throws InsufficientInitialAmountException, InvalidAccountNumberException{
		AccountService accServ = new AccountServiceImpl();
		Account acc1 = new Account();
		acc1.setAccountNumber(1);
		acc1.setAmount(5000);
		accServ.createAccount(acc1);
		
		Account acc2 = new Account();
		acc2.setAccountNumber(2);
		acc2.setAmount(50000);
		accServ.createAccount(acc2);
	}
	
	@Test(expected = InvalidAccountNumberException.class)
	public void testViewAccountShouldFailWhenAccountNoNotStore() throws InsufficientInitialAmountException, InvalidAccountNumberException{
		AccountService accServ = new AccountServiceImpl();
		Account acc1 = new Account();
		acc1.setAccountNumber(1);
		acc1.setAmount(5000);
		accServ.createAccount(acc1);
		
		Account acc2 = new Account();
		acc2.setAccountNumber(2);
		acc2.setAmount(50000);
		accServ.createAccount(acc2);
		
		accServ.viewAccount(3);
		
	}
}
