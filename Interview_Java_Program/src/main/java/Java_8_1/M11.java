package Java_8_1;

class G{
	G(){
		System.out.println("G()");
	}
	
	G(int i){
		System.out.println("G(int):" + i);
	}
	
	G(int i, int j){
		System.out.println("G(int):" + i);
	}
	
	void test() {
		System.out.println("from test");
	}
}

interface H{
	G m1();
}




interface I{
	G m1(int i);
}

interface J{
	G method1(int i, int j);
}




public class M11 {
	public static void main(String[] args) {
		H h1 = G :: new;
		System.out.println("-------------");
		G g1 = h1.m1();
		g1.test();	
		System.out.println("--------");
		I obj = G :: new;
		G g2 = obj.m1(1000);
		g2.test();
		System.out.println("------------");
		J j1 = G :: new;
		G g3 = j1.method1(100, 200);
		g3.test();
		
	}
	
}
