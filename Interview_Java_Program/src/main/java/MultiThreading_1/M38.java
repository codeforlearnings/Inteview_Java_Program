package MultiThreading_1;


class A60
{


}
class Thread60 extends Thread
{
	A60 obj;
	Thread60(A60 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		
		synchronized (obj)
		{
			System.out.println("wait on " + obj + " begin by " + Thread.currentThread().getName());
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + obj + " end by " + Thread.currentThread().getName());			
		}
	}
}

class Thread61 extends Thread
{
	A60 obj;
	Thread61(A60 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		synchronized (obj)
		{
			System.out.println("wait on " + obj + " begin by " + Thread.currentThread().getName());
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + obj + " end by " + Thread.currentThread().getName());			
		}
	}
}
public class M38 {
	public static void main(String[] args) throws InterruptedException{
		A60 obj1 = new A60();
		A60 obj2 = new A60();
		Thread60 t1 = new Thread60(obj1);
		t1.start();
		Thread61 t2 = new Thread61(obj1);
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10 sec sleep");
		synchronized (obj1)
		{
			System.out.println("test2 on " + obj1 + " begin by " + Thread.currentThread().getName());
			obj1.notifyAll();
			System.out.println("test2 on " + obj1 + " end by " + Thread.currentThread().getName());
		}
	}
}











