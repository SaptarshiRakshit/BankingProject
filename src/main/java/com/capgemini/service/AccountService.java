package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService {
    public boolean createAccount(Account acc) throws InsufficientInitialAmountException, InvalidAccountNumberException;
	
	public boolean depositAccount(int accountNumber , int amount);
	
	public boolean withdrawtAccount(int accountNumber , int amount);
	
	public boolean fundTransfer(int fromAccountNumber ,int toAccountNumber , int amount);

	 public Account viewAccount(int accountNumber) throws InvalidAccountNumberException;
	 
}
