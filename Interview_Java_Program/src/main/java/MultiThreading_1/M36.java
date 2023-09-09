package MultiThreading_1;

class A36
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
	synchronized void test2()
	{
		System.out.println("test2 on " + this + " begin by " + Thread.currentThread().getName());
		notifyAll();
		System.out.println("test2 on " + this + " end by " + Thread.currentThread().getName());
	}

}
class Thread39 extends Thread
{
	A36 obj;
	Thread39(A36 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}

class Thread37 extends Thread
{
	A36 obj;
	Thread37(A36 obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
public class M36 {
	public static void main(String[] args) throws InterruptedException{
		A36 obj1 = new A36();
		A36 obj2 = new A36();
		Thread39 t1 = new Thread39(obj1);
		t1.start();
		Thread39 t2 = new Thread39(obj1);
		t2.start();
		Thread.sleep(10000);
		System.out.println("main after 10 sec sleep");
		obj2.test2();
	}
}











