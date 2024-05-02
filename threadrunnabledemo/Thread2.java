package threadrunnabledemo;

public class Thread2  implements Runnable{

	@Override
	public void run() {
		
		while (true) {
			System.out.println("Bhargav Thread");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) {
	Thread2 thread2=new Thread2();
	Thread t2 =new Thread(thread2);
	t2.setDaemon(true);
	t2.start();
	for(int i=0;i<=10;i++) {
		System.out.println("main thread");
		
	  try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
}
}
