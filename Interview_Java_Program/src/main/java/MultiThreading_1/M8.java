package MultiThreading_1;
class H implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M8 {
	public static void main(String[] args) {
		H h1 = new H();
		Thread t1 = new Thread(h1);
		t1.start();
		//h1.run();
		//t1.run();
		for(int i = 2000; i <= 3000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
	}
}
