package MultiThreading_1;
class C implements Runnable
{
	@Override
	public void run() {
		for(int i = 2000; i <= 3000; i++)
		{
			System.out.println("second loop :" + i);
		}
	}
}
class D implements Runnable
{
	@Override
	public void run() {
		for(int i = 4000; i <= 5000; i++)
		{
			System.out.println("third loop :" + i);
		}	
	}
}
public class M4 {
	public static void main(String[] args) {
		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.start();
		
		D d1 = new D();
		Thread t2 = new Thread(d1);
		t2.start();
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("first loop :" + i);
		}
	}
}
