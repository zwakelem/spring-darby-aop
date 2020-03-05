package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	match only for addAccount method in the AccountDAO class
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
//	match for any method that starts with add and returns void 
//	@Before("execution(public void add*())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
//	match for any method that starts with add and returns void 
//	@Before("execution(void add*())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
//	match for any method that starts with add and returns anything
//	@Before("execution(* add*())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
// 	match for any method that starts with add, returns anything,
//	takes Account class as 1st param and anything else as 2nd param
//	@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
//	match for any method that starts with add, returns anything, takes anything as param 
//	@Before("execution(* add*(..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n ===========> @Before advice on addAccount()");
//	}
	
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n ===========> @Before advice on addAccount()");
	}
}
