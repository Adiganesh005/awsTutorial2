
public class Calculator2 extends Calculator1 {
	public int sum3(int a, int b, int c){
		
		int d, e;
		d = sum(a,b);
		e = sum(d,c);
		return e;
		
	}
	public int sum4(int a, int b, int c, int x){
		
		int d, e;
		d = sum(a,b);
		e = sum(d,c);
		d = 0;
		d = sum(e,x);
		return d;
		
	}
	public int sum5(int a, int b, int c, int x, int y){
		
		int d, e;
		d = sum(a,b);
		e = sum(d,c);
		d = 0;
		d = sum(e,x);
		e = 0;
		e = sum(d,y);
		return e;
		
	}
	public int sum6(int a, int b, int c, int x, int y, int z){
		
		int d, e;
		d = sum(a,b);
		e = sum(d,c);
		d = 0;
		d = sum(e,x);
		e = 0;
		e = sum(d,y);
		
		d = 0;
		d = sum(e,z);
		return d;
		
	}
public int sum7(int a, int b, int c, int x, int y, int z, int f){
		
		int d, e;
		d = sum(a,b);
		e = sum(d,c);
		d = 0;
		d = sum(e,x);
		e = 0;
		e = sum(d,y);
		
		d = 0;
		d = sum(e,z);
		e = 0;
		e = sum(d,f);
		return e;
		
	}

}
