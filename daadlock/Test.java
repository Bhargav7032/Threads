package threaddemo.daadlock;
public class Test {
	
	public static void main(String[] args) {
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();
		Thread1 t1 = new Thread1(r1, r2);
		t1.start();
		
		Thread2 t2 = new Thread2(r1, r2);
		t2.start();
	}

}
