package narmalclassthreads;

public class Stream  extends Thread{
	public void doStream() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Stream");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
