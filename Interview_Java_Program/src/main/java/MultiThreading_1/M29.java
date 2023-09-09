package MultiThreading_1;
class X extends Thread
{
	X()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M29 {
	public static void main(String[] args) {
		System.out.println(1);
		X obj = new X();
		System.out.println(2);
	}
}
