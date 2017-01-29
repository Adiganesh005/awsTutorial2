package com.practice.questions;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :  ");
		
		String userNumber = scanner.nextLine();
		Palindrome palin = new Palindrome(userNumber);
		
		System.out.println("Entered String is " + palin.getPalindrome());
		System.out.println(userNumber.length());
		
		System.out.println(palin.isGivenNumberPalindrome(userNumber));
		
	
		

	}

}
