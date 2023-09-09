package MultiThreading_2;
class B3 extends Thread
{
	@Override
	public void run() {
		try
		{
			sleep(10000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
public class M3 {
	public static void main(String[] args) throws InterruptedException{
		B3 b1 = new B3();
		b1.start();
		Thread.sleep(2000);
		System.out.println(b1.getState());
	}
}
