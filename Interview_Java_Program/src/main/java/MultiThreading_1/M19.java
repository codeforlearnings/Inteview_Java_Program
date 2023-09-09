package MultiThreading_1;
class Q extends Thread
{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M19 {
	public static void main(String[] args) {
		Q q1 = new Q();
		q1.start();
		System.out.println("done");
	}
}
