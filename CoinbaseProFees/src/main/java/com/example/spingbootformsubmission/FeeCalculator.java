package com.example.spingbootformsubmission;

import java.util.ArrayList;

public class FeeCalculator {
	
	double profit;
	double fees;
	
	int[] tiers = {10000, 50000, 100000, 1000000, 10000000, 50000000, 100000000, 300000000, 500000000};
	
	public void calculate(Transaction t, double p, double f) {
		fees = f;
		profit = p;
		int tier = tiers.length;
		for(int i = 0; i < tiers.length; i++) {
			if(profit < tiers[i]) {
				tier = i;
				break;
			}
		}
		if(tier == 0) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			profit -= (t.getAmount() * 0.005);
			fees += t.getAmount() * 0.005;
		}
		else if(tier == 1) {
			
		}
		else if(tier == 2) {
			
		}
		else if(tier == 3) {
			
		}
		else if(tier == 4) {
					
		}
		else if(tier == 5) {
			
		}
		else if(tier == 6) {
			
		}
		else if(tier == 7) {
			
		}
		else {
			
		}
	}
	
	public double getProfit() {
		return profit;
	}
	
	public double getFees() {
		return fees;
	}
}
