package Java_8_2;
@FunctionalInterface
interface A4
{
	int sum(int i, int j);
}
class M13
{
	public static void main(String[] args) 
	{
		A4 a1 = (i, j) -> i + j;
		int i = a1.sum(10, 20);
		System.out.println("done with :" + i);
	}
}
