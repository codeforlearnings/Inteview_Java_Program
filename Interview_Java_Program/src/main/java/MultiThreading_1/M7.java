package MultiThreading_1;
class G extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M7 {
	public static void main(String[] args) {
		G g1 = new G();
		//g1.start();
		g1.run();
		for(int i = 2000; i <= 3000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
	}
}
