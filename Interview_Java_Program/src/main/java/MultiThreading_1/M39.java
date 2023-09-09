package MultiThreading_1;

class Thread70 extends Thread
{
	@Override
	public void run() {
		
		synchronized (this)
		{
			System.out.println("wait on " + this + " begin by " + Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + this + " end by " + Thread.currentThread().getName());			
		}
	}
}

class Thread71 extends Thread
{
	public void run() {
		
		synchronized (this)
		{
			System.out.println("wait on " + this + " begin by " + Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + this + " end by " + Thread.currentThread().getName());			
		}
	}
}
public class M39 {
	public static void main(String[] args) throws InterruptedException{
		Thread70 t1 = new Thread70();
		t1.start();
		Thread71 t2 = new Thread71();
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10 sec sleep");
		synchronized (t1)
		{
			System.out.println("test2 on " + t1 + " begin by " + Thread.currentThread().getName());
			t1.notify();
			System.out.println("test2 on " + t1 + " end by " + Thread.currentThread().getName());
		}
		synchronized (t2)
		{
			System.out.println("test2 on " + t2 + " begin by " + Thread.currentThread().getName());
			t2.notify();
			System.out.println("test2 on " + t2 + " end by " + Thread.currentThread().getName());
		}

	
	
	}
}











