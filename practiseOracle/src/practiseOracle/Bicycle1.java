package practiseOracle;

public class Bicycle1 {
	int seatHeight = 0;
	
	Bicycle1(int height){
		seatHeight = height;
		System.out.println(seatHeight);
		//System.out.println(getClass());
	}

	public Bicycle1() {
		// TODO Auto-generated constructor stub
	}
	
	public int getHeight(){
		return seatHeight;
	}

}
