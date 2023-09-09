package MultiThreading_1;


class Thread80 extends Thread
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

class Thread81 extends Thread
{
	Thread80 obj;
	Thread81(Thread80 obj)
	{
		this.obj = obj;
	}
	public void run() {
		
		synchronized (obj)
		{
			System.out.println("notify on " + obj + " begin by " + Thread.currentThread().getName());
			obj.notify();
			System.out.println("notify on " + obj + " end by " + Thread.currentThread().getName());			
		}
	}
}
public class M40 {
	public static void main(String[] args) throws InterruptedException{
		Thread80 t1 = new Thread80();
		t1.start();
		Thread.sleep(10000);
		System.out.println("main after 10 sec sleep");
		Thread81 t2 = new Thread81(t1);
		t2.start();
	}
}











