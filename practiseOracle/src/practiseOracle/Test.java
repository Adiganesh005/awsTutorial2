package practiseOracle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test implements Cyc{

	public static void main(String[] args) {

		Bicycle b1 = new Bicycle();
		
		Class c1 = b1.getClass();
		
		System.out.println(c1.getName());
		
		c1.getDeclaredClasses();
		Method m[] = c1.getDeclaredMethods();
		for (Method method : m){
			System.out.println(method.getName());
		}
		Field f[] = c1.getDeclaredFields();
		for (Field field : f){
			System.out.println(field.getName());
		}
		
		//System.out.println(f);
		
		Cyc z1 = new Test();
		System.out.println(z1 instanceof Cyc);
	}

}
