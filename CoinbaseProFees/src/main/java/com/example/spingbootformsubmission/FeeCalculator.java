package com.example.spingbootformsubmission;

import java.util.ArrayList;

public class FeeCalculator {
	
	double profit;
	double fees;
	
	int[] tiers = {10000, 50000, 100000, 1000000, 10000000, 50000000, 100000000, 300000000, 500000000};
	
	public void calculate(Transaction t, double p, double f) {
		fees = f;
		int tier = tiers.length;
		for(int i = 0; i < tiers.length; i++) {
			if(p < tiers[i]) {
				tier = i;
			}
		}
		
	}
	
	public double getProfit() {
		return profit;
	}
	
	public double getFees() {
		return fees;
	}
}
