package General_Program;

class MyThread extends Thread{
	public void run() {
		Thread th1=Thread.currentThread();
		
		ThreadGroup tg=th1.getThreadGroup();
		int total=0;
		
		synchronized(this) {
		for(int i=1;i<=10;i++) {
		System.out.println(th1.getName()+"-"+tg.getName()+"-"+th1.getState()+"total count-"+total);
		total=total+1;
		notify();
		}
		
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
		
		th.setPriority(1);
		
		t1.setDaemon(true);
		t1.start();
		
	
		try {
			
			System.out.println("Current Thread Name-1st "+Thread.currentThread().getName()+" testing is thread daemon - "+t1.isDaemon());
			//wait(1000);
			t1.join(1000);
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		t2.start();
		
		try {

			System.out.println("Current Thread Name-2nd "+Thread.currentThread().getName());
		//	Thread.sleep(5000);
				t2.join(1000);
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		t3.start();
		
		synchronized(t1){
			t1.wait(5000);
			
		}
		
		try {
				System.out.println("Current Thread Name- 3rd "+Thread.currentThread().getName());
				//Thread.sleep(1500);
				t3.join(1000);
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}
}
