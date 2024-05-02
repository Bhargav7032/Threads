package ThreadYieldDemo;
public class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("child thread");
		}
	}
}
