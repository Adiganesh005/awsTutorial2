package practiseOracle;

public class ClassPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j, k = 0;
		for(i = 1; i<=20; i++){
			for(j = 1; j<=i; j++){
				if(i%j == 0){
					k++;
				}
				
			}
			if(k <= 2)
				System.out.println(i);
			k = 0;
		}
		
	}

}
