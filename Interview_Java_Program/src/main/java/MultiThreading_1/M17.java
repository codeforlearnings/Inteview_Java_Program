package MultiThreading_1;

class N implements Runnable
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M17 {
	public static void main(String[] args) {
		N obj = new N();
		Thread t1 = new Thread(obj, "my first thread");
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}
}