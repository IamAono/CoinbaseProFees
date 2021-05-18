package com.example.spingbootformsubmission;

import java.util.ArrayList;

public class FeeCalculator {
	
	public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}
	
	public void calculate() {
		double profit = 0;
		double fees = 0;
		int[] tiers = {10000, 50000, 100000, 1000000, 10000000, 50000000, 100000000, 300000000, 500000000};
		for(int i = 0; i < transactions.size(); i++) {
			Transaction t = transactions.get(i);
			if(t.getBS() == "buy") {
				
			}
			else {
				
			}
		}
	}
}
