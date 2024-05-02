package threadsdemo;
public class MyThread extends Thread {
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("Start");
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread "+Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		//myThread1.setPriority(Thread.MIN_PRIORITY);
		MyThread myThread2 = new MyThread();
		//myThread2.setPriority(Thread.NORM_PRIORITY);
		MyThread myThread3 = new MyThread();
		//myThread3.setPriority(Thread.MAX_PRIORITY);
		
		myThread1.setName("T1");
		myThread2.setName("T2");
		myThread3.setName("T3");
		
		System.out.println(myThread1.getPriority());
		System.out.println(myThread2.getPriority());
		System.out.println(myThread3.getPriority());
		
		System.out.println(myThread1.getName());
		System.out.println(myThread2.getName());
		System.out.println(myThread3.getName());
		
//		myThread1.start();
//		myThread2.start();
//		myThread3.start();
	}
}
