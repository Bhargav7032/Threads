package ThreadJoin;

public class Weddingcardprinting extends  Thread{

	@Override
	public void run() {
		 for(int i=1;i<=10;i++) {
			 
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Weddingcardprinting....");
		 }
	}
}
