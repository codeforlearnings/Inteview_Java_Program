package MultiThreading_1;

class A34
{
	static void test1()
	{
		Thread t1 = Thread.currentThread();
		synchronized (A34.class)
		{
			for(int i = 1; i <= 1000; i++)
			{
				System.out.println("from test1 with " + i + " by " + t1.getName());
			}
		}
	}
	static void test2()
	{
		Thread t1 = Thread.currentThread();
		synchronized (A34.class)
		{
			for(int i = 1; i <= 1000; i++)
			{
				System.out.println("from test2 with " + i + " by " + t1.getName());
			}
		}
	}	
}

class Thread10 extends Thread
{
	@Override
	public void run() {
		A34.test1();
	}
}

class Thread20 extends Thread
{
	@Override
	public void run() {
		A34.test2();
	}
}



public class M34 {
	public static void main(String[] args) {
		Thread10 t1 = new Thread10();
		t1.start();
		
		Thread20 t2 = new Thread20();
		t2.start();
	}
}







