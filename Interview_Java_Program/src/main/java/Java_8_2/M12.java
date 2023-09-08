package Java_8_2;
interface A3
{
	int sum(int i, int j);
}
class M12
{
	public static void main(String[] args) 
	{
		A3 a1 = (i, j) -> i + j;
		int i = a1.sum(10, 20);
		System.out.println("done with :" + i);
	}
}
