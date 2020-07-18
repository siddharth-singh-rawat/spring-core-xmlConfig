package com.sid.myproject.lottery;

public class LuckyLotteries implements Lottery {

	//Setting values by Setter injection
	private String companyName;
	private String companyAddress;
	
	
	//Setting value by constructor injection
	private int starRating;
	private LotteryNumberGenerator lotteryNumberGenerator;
	
	
	public LuckyLotteries() {
	}
	
	public LuckyLotteries(int starRating, LotteryNumberGenerator lotteryNumberGenerator) {
		this.starRating = starRating;
		this.lotteryNumberGenerator = lotteryNumberGenerator;
	}
	
	public void myInitMethod() {
		System.out.println("LuckyLotteries: myInitMethod method called.");
	}
	
	public void myCleanUpMethod() {
		System.out.println("LuckyLotteries: myCleanUpMethod method called");
	}

	public void companyDetails() {
		System.out.println(
				"Company Details: companyName[" + getCompanyName() + "] companyAddress[" + getCompanyAddress() + "] starRating["+starRating+"]");
	}

	public String generateLotteryNumber() {
		return lotteryNumberGenerator.generateLotteryNumber();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	

}
