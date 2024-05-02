package threadrunnabledemo;

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++) {
	System.out.println(Thread.currentThread());
		}
		 ThreadRunnable threadRunnable=new ThreadRunnable();
		   Thread t1=new Thread(threadRunnable);
		   t1.setPriority(1);
		 
		   Thread.sleep(1000);
		   t1.start();
		   
		   Thread t2=new Thread();
		
		   t2.setPriority(5);
		   System.out.println(t2.getPriority());
		   t2.start();
		   Thread.sleep(1000);
		   
		   Thread t3=new Thread();
		   t3.setPriority(9);
		  System.out.println(t3.getPriority());
		   t3.start();
	

}
}