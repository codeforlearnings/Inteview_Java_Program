package Java_8;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class M25 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("F:\\sofwares\\eclipse-jee-2020-09-R-win32-x86_64\\eclipse");
		Stream<Path> files = Files.list(f1.toPath()); //list method introduced in JDK1.8
	    files.forEach(c1 -> System.out.println(c1.getFileName()));		
	}
}
