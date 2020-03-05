package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		Account account = new Account();
		accountDAO.addAccount(account, true);
		membershipDAO.addAccount();
		accountDAO.doWork();
		membershipDAO.goToSleep();
		
//		System.out.println("\n lets do it again!");
		
//		accountDAO.addAccount();
		
		context.close();

	}

}
