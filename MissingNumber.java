package com.practice.geeks;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		for(int T = sc.nextInt(); T < 25; T--){
			int N = sc.nextInt();
			int Arr[] = new int[N-1];
			if((N >= 1)&&(N <=10000)){
				
				for(int i = 0; i <= N-1; i++){
					if((Arr[i] > 0) && (Arr[i] <= 10000)){
						int Arr1[] = new int[N];
						for(int j = 0; j <= N; j++){
							Arr1[j] = j;
							if(Arr[i] != Arr1[j]){
								System.out.println(j);
								
							}
						}
						}
					}
					
				}
			
			
			
			
		}

	}

}
