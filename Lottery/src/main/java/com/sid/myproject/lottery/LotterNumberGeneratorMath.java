package com.sid.myproject.lottery;

public class LotterNumberGeneratorMath implements LotteryNumberGenerator {

	//Setting values by setter injection
	private int min;
	private int max;

	public String generateLotteryNumber() {
		int result = (int)(Math.random()*((max-min)+1))+min;
		System.out.println("LotterNumberGeneratorMath result["+result+"]");
		return String.valueOf(result);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
