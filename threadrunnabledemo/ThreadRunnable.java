package threadrunnabledemo;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread"+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
