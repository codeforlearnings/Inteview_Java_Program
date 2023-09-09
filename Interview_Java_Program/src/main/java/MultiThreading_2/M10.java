package MultiThreading_2;
class Employee
{
	//several members
}
class A10 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
class B10 extends Employee implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class M10 {
	public static void main(String[] args) {
		A10 a1 = new A10();
		a1.start();
		A10 a2 = new A10();
		a2.start();
		A10 a3 = new A10();
		a3.start();
		
		
		B10 b1 = new B10();
		Thread t1 = new Thread(b1);
		t1.start();
		
		Thread t2 = new Thread(b1);
		t2.start();
		
		Thread t3 = new Thread(b1);
		t3.start();
		
		
		
		
		
		
		
	}
}









