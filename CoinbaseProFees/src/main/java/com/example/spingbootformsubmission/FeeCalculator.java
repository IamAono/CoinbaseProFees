package com.example.spingbootformsubmission;

import java.util.ArrayList;

public class FeeCalculator {
	
	private double profit = 0;
	private double fees = 0;
	
	public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public void addTransaction(Transaction t) {
		transactions.add(t);
		System.out.println(t.getMakerTaker()+ " " + t.getBuySell() + " " +  t.getAmount());
	}
	
	public void calculate() {
		int[] tiers = {10000, 50000, 100000, 1000000, 10000000, 50000000, 100000000, 300000000, 500000000};
		for(int i = 0; i < transactions.size(); i++) {
			Transaction t = transactions.get(i);
			if(t.getBuySell() == "buy") {
				
			}
			else {
				
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
