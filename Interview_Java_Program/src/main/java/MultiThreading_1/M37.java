package MultiThreading_1;


class A50
{
	synchronized void test1()
	{
		System.out.println("test1 on " + this + " begin by " + Thread.currentThread().getName());
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 on " + this + " end by " + Thread.currentThread().getName());
	}

}
class Thread50 extends Thread
{
	A50 obj;
	Thread50(A50 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}

class Thread51 extends Thread
{
	A50 obj;
	Thread51(A50 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
public class M37 {
	public static void main(String[] args) throws InterruptedException{
		A50 obj1 = new A50();
		A50 obj2 = new A50();
		Thread50 t1 = new Thread50(obj1);
		t1.start();
		Thread51 t2 = new Thread51(obj1);
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











