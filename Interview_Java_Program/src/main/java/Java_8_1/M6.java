package Java_8_1;
interface B{
	void test1(int i);
}
public class M6 {
	static void m1(int i) {
		System.out.println("i am from m1:" + i);
	}
	
	void m2(int i) {
		System.out.println("i am from m2:" + i);
	}
	
	public static void main(String[] args) {
		B b1 = M6 :: m1;
		b1.test1(100);
		
		M6 obj = new M6();
		B b2 = obj :: m2;
		b2.test1(200);	
		
	}
}
