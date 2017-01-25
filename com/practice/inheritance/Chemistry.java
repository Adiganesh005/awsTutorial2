package com.practice.inheritance;

public class Chemistry extends Department{
	int funds = 500;
	
	public int getChemistryTotalFunds(){
		return funds + getTotalFunds();
	}

	public int getChemistryFunds(){
		return funds;
	}
}
