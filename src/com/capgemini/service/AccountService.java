package com.capgemini.service;

import com.capgemini.beans.Account;

public interface AccountService {
    public boolean createAccount(Account acc);
	
	public boolean depositAccount(int accountNumber , int amount);
	
	public boolean withdrawtAccount(int accountNumber , int amount);
	
	public boolean fundTransfer(int fromAccountNumber ,int toAccountNumber , int amount);

	 public Account viewAccount(int accountNumber);
	 
}
