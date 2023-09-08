package Java_8;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class M4 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 40, 50, 111};
		IntStream intStream = Arrays.stream(elements);
		intStream.forEach(System.out :: println);
		System.out.println("------------");
		
		double[] heights = {4.5, 5.9, 6.1, 5.7};
		DoubleStream doubleStream = Arrays.stream(heights);
		doubleStream.forEach(System.out :: println);
	}
}
