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
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			profit -= (t.getAmount() * 0.0035);
			fees += t.getAmount() * 0.0035;
		}
		else if(tier == 2) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0025);
				fees += t.getAmount() * 0.0025;
			}
			else {
				profit -= (t.getAmount() * 0.0015);
				fees += t.getAmount() * 0.0015;
			}
		}
		else if(tier == 3) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.002);
				fees += t.getAmount() * 0.002;
			}
			else {
				profit -= (t.getAmount() * 0.001);
				fees += t.getAmount() * 0.001;
			}
		}
		else if(tier == 4) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0018);
				fees += t.getAmount() * 0.0018;
			}
			else {
				profit -= (t.getAmount() * 0.0008);
				fees += t.getAmount() * 0.0008;
			}
		}
		else if(tier == 5) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0015);
				fees += t.getAmount() * 0.0015;
			}
			else {
				profit -= (t.getAmount() * 0.0005);
				fees += t.getAmount() * 0.0005;
			}
		}
		else if(tier == 6) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.001);
				fees += t.getAmount() * 0.001;
			}
			else {
				profit -= (t.getAmount() * 0.0002);
				fees += t.getAmount() * 0.0002;
			}
		}
		else if(tier == 7) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0006);
				fees += t.getAmount() * 0.0006;
			}
		}
		else if(tier == 8) {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0005);
				fees += t.getAmount() * 0.0005;
			}
		}
		else {
			if(t.getBuySell().equals("buy")) {
				profit -= t.getAmount();
			}
			else {
				profit += t.getAmount();
			}
			if(t.getMakerTaker().equals("taker")) {
				profit -= (t.getAmount() * 0.0004);
				fees += t.getAmount() * 0.0004;
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
