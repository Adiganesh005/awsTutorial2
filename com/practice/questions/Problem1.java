package com.practice.questions;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int Array[][] = new int[n][n];
		for(int i =0; i<= 4; i++){
			for(int j = 0; j<=i; i++){
				Array[i][j] = i;
			}
		}
		for(int i =0; i<= 4; i++){
			for(int j = 0; j<=i; i++){
				System.out.println(Array[i][j]);
			}
		}
		
		

	}

}
