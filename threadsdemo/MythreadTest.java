package threadsdemo;

public class MythreadTest {

	public static void main(String []args) {
		MythreadDemo mythreadDemo=new MythreadDemo();
		Thread thread =new Thread(mythreadDemo);
		thread.setName("BhargavRam");
		thread.start();
		
		Thread t2 =new Thread(mythreadDemo);
		t2.start();
		
		
		Thread t3 =new Thread(mythreadDemo);
		t3.start();
	}
}
