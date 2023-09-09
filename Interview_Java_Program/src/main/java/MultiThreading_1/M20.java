package MultiThreading_1;

class R extends Thread
{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M20 {
	public static void main(String[] args) {
		R r1 = new R();
		r1.setDaemon(true);
		r1.start();
		System.out.println("done");
	}
}
