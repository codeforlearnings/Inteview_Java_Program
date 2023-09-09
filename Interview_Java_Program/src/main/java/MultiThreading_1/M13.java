package MultiThreading_1;

public class M13 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(11);
		System.out.println(t1.getPriority());
	}
}


/*

Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

*/
