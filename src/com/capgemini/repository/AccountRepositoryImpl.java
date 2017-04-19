package com.capgemini.repository;

import com.capgemini.beans.Account;
import com.capgemini.storage.AccountStore;

public class AccountRepositoryImpl implements AccountRepository {

	@Override
	public boolean saveAccount(Account acc) {
		AccountStore.accountStore.put(acc.getAccountNumber(), acc);
	
		return true;
	}

	@Override
	public boolean deleteAccount(int accountNumber) {
		if (AccountStore.accountStore.remove(accountNumber) != null)
		return true;
		else 
			return false;
	}

	@Override
	public Account getAccount(int accountNumber) {
		return AccountStore.accountStore.get(accountNumber);
	}
}
