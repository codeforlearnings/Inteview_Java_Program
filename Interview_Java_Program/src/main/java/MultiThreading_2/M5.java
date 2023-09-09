package MultiThreading_2;
class D extends Thread {
	
	Thread mainThread;
	
	D(Thread mainThread)
	{
		this.mainThread = mainThread;
	}
	
	@Override
	public void run() {
		try
		{
			sleep(100);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("state of main thread:" + mainThread.getState());
	}
}
public class M5 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		D d1 = new D(t1);
		d1.start();
		try
		{
			d1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
	}
}





