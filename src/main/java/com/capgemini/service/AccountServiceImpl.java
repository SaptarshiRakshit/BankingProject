package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImpl;
import com.capgemini.storage.AccountStore;

public class AccountServiceImpl implements AccountService {

	@Override
	public boolean createAccount(Account acc) throws InsufficientInitialAmountException, InvalidAccountNumberException {
		AccountRepository accRepo = new AccountRepositoryImpl();
		Account a = accRepo.getAccount(acc.getAccountNumber());
		if(a == null){
			if(acc.getAmount()>5000){
				return accRepo.saveAccount(acc);
			}
			else
				throw new InsufficientInitialAmountException("Initial amount must be  greater than 5000");
		}
		else
			throw new InvalidAccountNumberException("Account number is already present in store");
	}

	@Override
	public boolean depositAccount(int accountNumber, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawtAccount(int accountNumber, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fundTransfer(int fromAccountNumber, int toAccountNumber, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account viewAccount(int accountNumber) {
		return AccountStore.accountStore.get(accountNumber);
	}

}
