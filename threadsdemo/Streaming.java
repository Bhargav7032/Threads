package threadsdemo;

public class Streaming extends Thread {
	@Override
	public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("Streaming");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	}
	
			
	

	
	

}
