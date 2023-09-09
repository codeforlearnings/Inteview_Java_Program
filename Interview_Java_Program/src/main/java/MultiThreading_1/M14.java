package MultiThreading_1;
class K extends Thread
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M14 {
	public static void main(String[] args) {
		K k1 = new K();
		k1.start();
		System.out.println(k1.getName());
		k1.setName("first child");
		System.out.println(k1.getName());
	}
}
