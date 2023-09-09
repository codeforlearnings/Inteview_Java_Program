package MultiThreading_1;

public class M11 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("initiator");
		System.out.println(t1.getName());
	}
}
