package MultiThreading_2;

class Test
{
	int i;
}

class Util
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
class A extends Thread
{
	Test t1;
	A(Test t1)
	{
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("a:" + t1.i);
		t1.i = 10;
		Util.sleep(500);
		System.out.println("b:" + t1.i);
		t1.i = 20;
		Util.sleep(500);
		System.out.println("c:" + t1.i);
		t1.i = 30;
	}
}
class B extends Thread
{
	Test t1;
	B(Test t1)
	{
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("d:" + t1.i);
		t1.i = 40;
		Util.sleep(500);
		System.out.println("e:" + t1.i);
		t1.i = 50;
		Util.sleep(500);
		System.out.println("f:" + t1.i);
		t1.i = 60;
	}
}
public class M1 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.i = 70;
		A a1 = new A(t1);
		a1.start();
		Util.sleep(250);
		B b1 = new B(t1);
		b1.start();
		Util.sleep(20000);
		System.out.println("g:" + t1.i);
	}
}









