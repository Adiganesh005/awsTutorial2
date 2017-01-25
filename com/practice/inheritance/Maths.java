package com.practice.inheritance;

public class Maths extends Department{

	int funds = 1000;
	
	public int getTotalFunds(){
		return funds + super.getTotalFunds();
		

	}
	
	public int getMathsFunds(){
		return funds;
	}
}
