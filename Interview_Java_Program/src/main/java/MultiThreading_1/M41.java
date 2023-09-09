package MultiThreading_1;

import java.util.ArrayList;

class Util1
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

class CommonTaskThread extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			//wait
			synchronized (this) {
				try
				{
					wait();
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			
			//common task. it can be any
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(i + " by " + getName());
				Util.sleep(1000);
			}
			
			//notify
			synchronized (this) {
				notify();
			}
		}
	}
}

class ThreadPoolManager
{
	private ArrayList<CommonTaskThread> pool = new ArrayList<CommonTaskThread>();
	
	public void init()
	{
		CommonTaskThread ct = null;
		for(int i = 1; i <= 10; i++)
		{
			ct = new CommonTaskThread();
			ct.start();
			pool.add(ct);
		}
	}
	
	public CommonTaskThread checkOut()
	{
		CommonTaskThread ct = null;
		if(pool.size() > 0)
		{
			ct = pool.remove(0);
		}
		else
		{
			ct = new CommonTaskThread();
			ct.start();
		}
		return ct;
	}
	
	public void checkIn(CommonTaskThread ct)
	{
		if(pool.size() < 10)
		{
			pool.add(ct);
		}
		else
		{
			ct = null;
		}
	}
	
	public void release()
	{
		CommonTaskThread ct = null;
		for(int i = 0; i < pool.size(); )
		{
			ct = pool.remove(0);
			ct = null;
		}
		pool = null;
	}
}

class Customer1 extends Thread
{
	private ThreadPoolManager tpm;
	Customer1(ThreadPoolManager tpm)
	{
		this.tpm = tpm;
	}
	
	@Override
	public void run() {
		while(true)
		{
			System.out.println("customer1 is trying to get a thread from the pool");
			CommonTaskThread ct = tpm.checkOut();
			synchronized (ct) {
				ct.notify();
			}
			synchronized (ct) {
				try {
					ct.wait();
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("customer1 is sending used thread back to the pool");
			tpm.checkIn(ct);
			Util.sleep(10000);
		}
	}
}
class Customer2 extends Thread
{
	private ThreadPoolManager tpm;
	Customer2(ThreadPoolManager tpm)
	{
		this.tpm = tpm;
	}
	
	@Override
	public void run() {
		while(true)
		{
			System.out.println("customer2 is trying to get a thread from the pool");
			CommonTaskThread ct = tpm.checkOut();
			synchronized (ct) {
				ct.notify();
			}
			synchronized (ct) {
				try {
					ct.wait();
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("customer2 is sending used thread back to the pool");
			tpm.checkIn(ct);
			Util.sleep(10000);
		}
	}
}
class Customer3 extends Thread
{
	private ThreadPoolManager tpm;
	Customer3(ThreadPoolManager tpm)
	{
		this.tpm = tpm;
	}
	
	@Override
	public void run() {
		while(true)
		{
			System.out.println("customer3 is trying to get a thread from the pool");
			CommonTaskThread ct = tpm.checkOut();
			synchronized (ct) {
				ct.notify();
			}
			synchronized (ct) {
				try {
					ct.wait();
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("customer3 is sending used thread back to the pool");
			tpm.checkIn(ct);
			Util.sleep(10000);
		}
	}
}
public class M41 {
	public static void main(String[] args) {
		ThreadPoolManager tpm = new ThreadPoolManager();
		tpm.init();
		
		Customer1 c1 = new Customer1(tpm);
		c1.start();
		
		Customer2 c2 = new Customer2(tpm);
		c2.start();
		
		Customer3 c3 = new Customer3(tpm);
		c3.start();
		
		Util.sleep(1000 * 1000);
		c1.stop();
		c2.stop();
		c3.stop();
		Util.sleep(20000);
		tpm.release();
		System.out.println("end of the game");
	}
}


















