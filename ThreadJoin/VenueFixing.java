package ThreadJoin;

public class VenueFixing extends Thread {
  
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			try {
				Thread. sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("VenueFixing....");
		}
	}
}