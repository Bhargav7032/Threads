package threaddemo.daadlock;

public class Thread2 extends Thread {
	private Resource1 resource1;
	private Resource2 resource2;

	public Thread2(Resource1 resource1, Resource2 resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}

	@Override
	public void run() {
		System.out.println("Thread2 Started....  ");
		synchronized (resource2) {
			System.out.println("Resource 2 is avilable for Thread2 waiting for Resouce 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resource1) {
				System.out.println("Resource 1 is also avilable for Thread2 task is done");
			}
		}

		System.out.println("Thread2 Ended....  ");

	}
}
