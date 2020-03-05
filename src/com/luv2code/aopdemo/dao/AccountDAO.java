package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": doing DB work adding account");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doing work method!!");
		return false;
	}

}
