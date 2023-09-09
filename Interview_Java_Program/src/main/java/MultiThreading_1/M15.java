package MultiThreading_1;

class L implements Runnable
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M15 {
	public static void main(String[] args) {
		L obj = new L();
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}
}