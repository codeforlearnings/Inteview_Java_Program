package General_Program;

class MyThread extends Thread{
	public void run() {
		Thread th1=Thread.currentThread();
		//Thread th2=Thread.currentThread();
		//Thread th3=Thread.currentThread();
		ThreadGroup tg=th1.getThreadGroup();
		for(int i=1;i<=10;i++) {
		System.out.println(th1.getName()+"-"+tg.getName()+"-"+th1.getState());
	//	System.out.println(th2.getName()+"-"+th2.getState());
	//	System.out.println(th3.getName()+"-"+th3.getState());
		
		
		try {
		//	wait(500);
			//Thread.sleep(500);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
		}
	}
}



public class MultiThreading {
	public static void main(String[] args) throws Throwable {
		MyThread th=new MyThread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		Thread t3=new Thread(th);
		System.out.println();
		t1.start();
		
		try {
			t1.join(1000);
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		try {
			//	wait(500);
				Thread.sleep(500);
				t2.join(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		try {
			//	wait(500);
				Thread.sleep(2000);
				t3.join(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		
		
			}
}
