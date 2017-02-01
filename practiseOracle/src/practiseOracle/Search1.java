package practiseOracle;

import java.util.Scanner;

public class Search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int n;
		int x;
		Scanner sc1 = new Scanner(System.in);
		//int t = sc1.nextInt();
		 n = sc1.nextInt();
		for(int i = 0; i<n; i++){
			arr[i] = sc1.nextInt();
			//System.out.println(arr[i]);
		}
		 x = sc1.nextInt();
		
		
		System.out.println(search(arr, n, x));
		
		//while(t>0){
		
	}

	 static int search(int arr[], int n, int x) {
		// TODO Auto-generated method stub
		for (int i=0;i<=n;i++){
			if(arr[i] == x)

			return i;

		
	}
		return -1 ;
	}

}
