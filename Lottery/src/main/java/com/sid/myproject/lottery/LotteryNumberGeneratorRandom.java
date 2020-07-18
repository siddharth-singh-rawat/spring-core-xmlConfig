package com.sid.myproject.lottery;

import java.util.Random;

public class LotteryNumberGeneratorRandom implements LotteryNumberGenerator {

	private int min;
	private int max;
	
	//Setting values by constructor injection
	public LotteryNumberGeneratorRandom(int min,int max) {
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Generate munber within range using Random class of java util.s
	 */
	public String generateLotteryNumber() {
		Random random = new Random();
		int result = random.nextInt((max - min) + 1) + min;
		System.out.println("LotteryNumberGeneratorRandom result["+result+"]");
		return String.valueOf(result);
	}

}
