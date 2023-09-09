package MultiThreading_2;
class E extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(i);
			yield();
		}
	}
}
class F extends Thread
{
	@Override
	public void run() {
		for(int i = 2000; i <= 3000; i++)
		{
			System.out.println(i);
			yield();
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		
		F f1 = new F();
		f1.start();
	}
}








