package practiseOracle;

public class CycleDemo {

	public static void main(String[] args) {

		/*Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.printValue();
		bike2.printValue();
		


		Bicycle bike;
		bike = new Bicycle();
		System.out.println(bike);*/
		
		

		
		int bike3 = new Bicycle1(5).getHeight();
		System.out.println(bike3);
		
		int height = new Bicycle().seatHeight;
		height = 2;
		System.out.println(height);
		
		Bicycle1 bike0 = new Bicycle1();
		System.out.println(bike0);
		System.out.println(bike0.getHeight());
		
		Bicycle bike1 =  new Bicycle();
		bike1.cadence = 20;
		bike1.gear = 3;
		System.out.println(bike1);
		
		System.out.println(bike1.height);

		
		
		
		
	}

}
