package threadsdemo;

public class Playvideo  extends Thread{
	
		@Override
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Play");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}	
		
		
			
	}


