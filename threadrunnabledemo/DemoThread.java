package threadrunnabledemo;
public class DemoThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000,100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		DemoThread demoThread = new DemoThread();
		
		ThreadGroup threadGroup = new ThreadGroup("Bhargav Thread Group");
		
		
		Thread t1 = new Thread(threadGroup,demoThread,"t1");
		t1.start();
		System.out.println(t1);
		
		Thread t2 = new Thread(threadGroup,demoThread,"t2");
		t2.start();
		System.out.println(t2);
		
		threadGroup.suspend();
		
		System.out.println("Test");
		
		
		   threadGroup.resume();
		
	}

}
