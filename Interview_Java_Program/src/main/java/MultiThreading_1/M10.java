package MultiThreading_1;
class J extends Thread
{
	@Override
	public void run() {
		System.out.println(getName());
		System.out.println(isDaemon());
		System.out.println(getPriority());
		System.out.println(getId());
	}
}
public class M10 {
	public static void main(String[] args) {
		J ref = new J();
		ref.start();
	}
}
