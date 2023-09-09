package MultiThreading_2;
class A9 extends Thread
{
	A9(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class B9 extends Thread
{
	B9(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class C9 implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M9 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("myFirstGroup");
		A9 a1 = new A9(tg, "firstThread");
		A9 a2 = new A9(tg, "secondThread");
		B9 b1 = new B9(tg, "thirdThread");
		B9 b2 = new B9(tg, "fourthThread");
		
		C9 c1 = new C9();
		Thread t1 = new Thread(tg, c1, "5thThread");
		Thread t2 = new Thread(tg, c1, "6thThread");
		
		a1.start();
		a2.start();
		b1.start();
		b2.start();
		t1.start();
		t2.start();
		
		tg.stop();
	}
}









