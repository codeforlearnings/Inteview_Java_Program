package Java_8;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class M27 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("F:\\sofwares\\bulk-data\\java-app2\\src\\com\\lara\\java8\\M14.java");
		Stream<String> lines = Files.lines(f1.toPath()); //lines method introduced in JDK1.8
		lines.forEach(c1 -> System.out.println(c1));		
	}
}
