package com.sid.myproject.lottery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FortuneLotteries implements Lottery {

	@Autowired
	@Qualifier("lotterNumberGeneratorMath")
	private LotteryNumberGenerator lotteryNumberGenerator;

	private String companyName;
	private String companyAddress;
	private int starRating;
	
	public void myInitMethod() {
		System.out.println("FortuneLotteries: myInitMethod method called.");
	}
	
	public void myCleanUpMethod() {
		System.out.println("FortuneLotteries: myCleanUpMethod method called");
	}
	
	public void companyDetails() {
		System.out.println("Company Details: companyName[" + companyName + "] companyAddress[" + companyAddress
				+ "] starRating[" + starRating + "]");
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

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

}
