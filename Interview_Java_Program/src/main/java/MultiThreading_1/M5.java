package MultiThreading_1;
class E extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		//e1.start();
		
		E e2 = new E();
		e2.start();
		for(int i = 5000; i <= 6000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
