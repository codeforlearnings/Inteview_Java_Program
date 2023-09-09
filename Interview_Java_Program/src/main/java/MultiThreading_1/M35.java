package MultiThreading_1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

class Shared35
{
	synchronized void test1(Shared35 obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by " + t1.getName());
		Util.sleep(1000);
		obj.test2(this);
		System.out.println("test1 end by " + t1.getName());
	}
	synchronized void test2(Shared35 obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by " + t1.getName());
		Util.sleep(1000);
		obj.test1(this);
		System.out.println("test2 end by " + t1.getName());
	}
}
class Util35
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
class Thread35 extends Thread
{
	Shared35 s1, s2;
	Thread35(Shared35 s1, Shared35 s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		s1.test1(s2);
	}
}

class Thread36 extends Thread
{
	Shared35 s1, s2;
	Thread36(Shared35 s1, Shared35 s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		s2.test2(s1);
	}
}
public class M35 {
	public static void main(String[] args) {
		Shared35 s1 = new Shared35();
		Shared35 s2 = new Shared35();
		Thread35 t1 = new Thread35(s1, s2);
		t1.start();
		Util.sleep(100);
		Thread36 t2 = new Thread36(s1, s2);
		t2.start();
		
		Util.sleep(2000);
		
		ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
		long[] ids = tmx.findDeadlockedThreads();
		
		if(ids != null)
		{
			System.out.println("Threads are under dead lock");
			System.out.println("dead locked thread ids: " + Arrays.toString(ids));
		}
		else
		{
			System.out.println("no threads are under dead lock");
		}
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
	}
}











