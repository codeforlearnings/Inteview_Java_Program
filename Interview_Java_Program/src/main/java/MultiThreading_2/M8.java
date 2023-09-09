package MultiThreading_2;


class Util8
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class A8 extends Thread
{
	ThreadLocal t1;
	A8(ThreadLocal t1)
	{
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("a:" + t1.get());
		t1.set(10);
		Util.sleep(500);
		System.out.println("b:" + t1.get());
		t1.set(20);
		Util.sleep(500);
		System.out.println("c:" + t1.get());
		t1.set(30);
	}
}
class B8 extends Thread
{
	ThreadLocal t1;
	B8(ThreadLocal t1)
	{
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("d:" + t1.get());
		t1.set(40);
		Util.sleep(500);
		System.out.println("e:" + t1.get());
		t1.set(50);
		Util.sleep(500);
		System.out.println("f:" + t1.get());
		t1.set(60);
	}
}
public class M8 {
	public static void main(String[] args) {
		ThreadLocal t1 = new ThreadLocal();
		t1.set(70);
		A8 a1 = new A8(t1);
		a1.start();
		Util.sleep(250);
		B8 b1 = new B8(t1);
		b1.start();
		Util.sleep(20000);
		System.out.println("g:" + t1.get());
	}
}









