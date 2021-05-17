package com.example.spingbootformsubmission;

import java.util.ArrayList;

public class FeeCalculator {
	
	public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}
}
