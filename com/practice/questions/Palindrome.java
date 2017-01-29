package com.practice.questions;

public class Palindrome {
	private String userNumber;
	
	public Palindrome(String userNumber){
		this.userNumber = userNumber;
	}
	
	public String getPalindrome(){
		//this.userNumber = userNumber;
		return userNumber;
	}
	
	public boolean isGivenNumberPalindrome(String userNumber){
		boolean number = false;
		int i = userNumber.length();
		int temp = 0;
		for(int j = 0; j <= userNumber.length()-1; j++){
			i -= 1;
			System.out.println(i);
			if(userNumber.charAt(j) == userNumber.charAt(i)){
				temp += 1;
				
			}else{
				temp = 0;
			}

		}
		if(temp == userNumber.length()){
		number = true; 
		}else {
			number = false;
		
		}
		
		return number;
	}


}
