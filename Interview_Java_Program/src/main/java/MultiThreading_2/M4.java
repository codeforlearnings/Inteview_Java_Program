package MultiThreading_2;
class C extends Thread{
	@Override
	public void run() {
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
	}
}
public class M4 {
	public static void main(String[] args) throws InterruptedException {
		C c1 = new C();
		c1.start();
		Thread.sleep(100);
		System.out.println(c1.getState());
	}
}
