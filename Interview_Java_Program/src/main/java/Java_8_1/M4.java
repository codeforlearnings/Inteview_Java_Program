package Java_8_1;
public class M4 {
	void hello() {
		System.out.println("from Hello");
	}
	
	public static void main(String[] args) {
		A a1 = new M4() :: hello;
		a1.test1();
	}
}
