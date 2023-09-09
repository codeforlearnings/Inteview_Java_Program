package MultiThreading_1;

class Shared
{
	//some attributes
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("from test1 " + i + " by " + t1.getName());
			//using attributes
		}
	}
	synchronized void test2()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("from test2 " + i + " by " + t1.getName());
		}
	}	
}
class Thread1 extends Thread
{
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test1();
	}
}
class Thread2 extends Thread
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test1();
	}
}
public class M32 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s2);
		
		t1.start();
		t2.start();
	}
}









