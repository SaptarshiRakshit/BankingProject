package com.capgemini.storage;

import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.beans.Account;

public class AccountStore {
	
	public static ConcurrentHashMap<Integer, Account> accountStore = new ConcurrentHashMap<Integer, Account>();
	

}
