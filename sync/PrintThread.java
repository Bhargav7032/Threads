package threaddemo.sync;

public class PrintThread extends Thread {

	private Table table;
	private int num;

	public PrintThread(Table table,int num) {
		super();
		this.table = table;
		this.num = num;
	}

	@Override
	public void run() {
		table.print(num);
	}

	public static void main(String[] args) throws InterruptedException {
		
		Table table = new Table();
		
		PrintThread p1 = new PrintThread(table,12);
		PrintThread p2 = new PrintThread(table,10);
		PrintThread p3 = new PrintThread(table,7);
		
		p1.start();
		p2.start();
		p3.start();

	}
	}
