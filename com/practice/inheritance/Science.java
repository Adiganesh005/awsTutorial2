package com.practice.inheritance;

public class Science extends Department {
	int funds = 700;
	
	public int getTotalFunds(){
		return funds + super.getTotalFunds();
	}
	
	public int getScienceFunds(){
		return funds;
	}

}
