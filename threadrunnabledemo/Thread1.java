package threadrunnabledemo;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Demo Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) {
	Thread1 thread1 = new Thread1() ;
	Thread t1=new Thread(thread1);
	t1.setDaemon(true);
	t1.start();
	 for(int i=0;i<5;i++) {
		 System.out.println("Main Thread");
		  try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
}