package com.sid.myproject.lottery;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		// Constructor and Setter Injection 
		Lottery lotteries = applicationContext.getBean("luckyLotteries", Lottery.class);
		lotteries.companyDetails();
		System.out.println("New Lottery Number: "+lotteries.generateLotteryNumber());
		
		
		System.out.println("\n========================================\n");
		
		
		//Autowiring
		FortuneLotteries forturneLotteries = applicationContext.getBean("fortuneLotteries", FortuneLotteries.class);
		forturneLotteries.setCompanyName("Fortune Lotteries");
		forturneLotteries.setCompanyAddress("A-234, Star road, Delhi-110099");
		forturneLotteries.setStarRating(5);
		forturneLotteries.companyDetails();
		System.out.println("New Lottery Number: "+forturneLotteries.generateLotteryNumber());
		
		applicationContext.close();
	}

}
