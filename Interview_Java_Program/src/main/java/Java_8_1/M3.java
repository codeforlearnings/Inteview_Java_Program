package Java_8_1;

public class M3 {

	static void m1() {
		System.out.println("from m1");
	}
	
	public static void main(String[] args) {
		A a1 = M3 :: m1;
		a1.test1();
	}
	
	
}
