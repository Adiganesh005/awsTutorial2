package practiseOracle;

public class SwitchDmeo {

	public static void main(String[] args) {


		int month = 2;
		int year = 1900;
		int Noofdays=0;
		
		switch(month){
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			Noofdays = 31;
			break;
		case 4: case 6: case 9: case 11:
			Noofdays = 30;
			break;
		case 2:
		
			if(((year % 4 == 0) && 
                    !(year % 100 == 0))
                    || (year % 400 == 0))
				Noofdays = 29;
			else Noofdays = 28;
			break;
			default:
				System.out.println("Invalid Month");
				break;
			
		}
		System.out.println(Noofdays);
		
		}
	}


