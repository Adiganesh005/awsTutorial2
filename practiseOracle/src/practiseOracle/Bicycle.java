package practiseOracle;

public class Bicycle extends Bicycle1{
	int cadence = 0;
	int gear = 1;
	int speed = 10;
	public Bicycle1 height;
	
	Bicycle(){
		height = new Bicycle1(1);
	}
	
	
	
	Bicycle(int newCadence, int newGear){
		cadence = newCadence;
		gear = newGear;
		speed = 0;
		height = new Bicycle1(1);
	}
	
	Bicycle(int newCadence, int newGear, int newSpeed){
		cadence = newCadence;
		gear = newGear;
		speed = newSpeed;
	}
	
	Bicycle(Bicycle1 height){
		//height = new Bicycle1();
		System.out.println(height);
	}
	
	
	
	
	
	public void changeCadence(int changeValue){
		cadence = changeValue;
	}
	
	public void changeGear(int changeValue){
		gear = changeValue;
		
	}
	
	public void changeSpeed(int changeValue){
		speed = changeValue;
	}
	
	public void printValue(){
		System.out.println("cadence:" + cadence + "speed:" + speed + "gear:" + gear);
	}

}
