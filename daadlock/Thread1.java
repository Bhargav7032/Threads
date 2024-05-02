package threaddemo.daadlock;
public class Thread1 extends Thread{
	
	private Resource1 resource1;
	private Resource2 resource2;
	
	public Thread1(Resource1 resource1, Resource2 resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		System.out.println("Thread1 Started....  ");
		synchronized (resource1) {
			System.out.println("Resource 1 is avilable for Thread1 waiting for Resouce 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resource2) {
				System.out.println("Resource 2 is also avilable for Thread1 task is done");
			}
		}
		
		System.out.println("Thread1 Ended....  ");
		
	}
	
	

}
