package com.capgemini.repository;

import com.capgemini.beans.Account;

public interface AccountRepository {
	public boolean saveAccount(Account acc);
	
	public boolean deleteAccount(int accountNumber);
	
	
}
