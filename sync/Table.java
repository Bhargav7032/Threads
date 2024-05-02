package threaddemo.sync;

public class Table {
	public void print(int num) {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(num + " * " + i + " = " + (i * num));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
