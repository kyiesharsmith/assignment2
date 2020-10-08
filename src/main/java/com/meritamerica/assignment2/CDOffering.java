package com.meritamerica.assignment2;

public class CDOffering {
	private int term;
	private double interestRate;
	
	CDOffering(int term, double interestRate){
		this.term = term;
		this.interestRate = interestRate;
	}
	int getTerm() {
		return this.term;
	}
	double getInterestRate() {
		return this.interestRate;
	}
}
