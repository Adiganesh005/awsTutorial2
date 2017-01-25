package com.practice.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept = new Department();
		System.out.println(dept.getTotalFunds());
		
		Maths math = new Maths();
		System.out.println(math.getMathsFunds());
		System.out.println(math.getTotalFunds());
		
		Chemistry chem = new Chemistry();
		System.out.println(chem.getChemistryFunds());
		System.out.println(chem.getChemistryTotalFunds());
		
		
		Science  sci = new Science();
		System.out.println(sci.getScienceFunds());
		System.out.println(sci.getTotalFunds());


	}

}
