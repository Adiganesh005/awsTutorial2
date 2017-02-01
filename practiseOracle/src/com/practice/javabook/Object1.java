package com.practice.javabook;

public class Object1 {
	//int a;
	
	/*Object1 (){
		
	}*/
	 int fact(int n) {
		 int result;
		        if(n==1) {
		        	return 1;
		        }
		        System.out.println(n);
		        result = fact(n-1) * n;
		        System.out.println("new" + n);
		        return result;
		 }

}
