package MultiThreading_2;

class Test7
{
	int i;
}

class Util7
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
class A7 extends Thread
{
	Test7 t1;
	A7(Test7 t1)
	{
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("a:" + t1.i);
		t1.i = 10;
		Util7.sleep(500);
		System.out.println("b:" + t1.i);
		t1.i = 20;
		Util7.sleep(500);
		System.out.println("c:" + t1.i);
		t1.i = 30;
	}
}
class B7 extends Thread
{
	Test t1;
	B7(Test t1)
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
public class M7 {
	public static void main(String[] args) {
		Test7 t1 = new Test7();
		t1.i = 70;
		A7 a1 = new A7(t1);
		a1.start();
		Util7.sleep(250);
		B7 b1 = new B7(t1);
		b1.start();
		Util7.sleep(20000);
		System.out.println("g:" + t1.i);
	}
}









