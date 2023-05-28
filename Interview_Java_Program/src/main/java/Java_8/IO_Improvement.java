package Java_8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class IO_Improvement {
	public static void main(String[] args) throws IOException{
		File f1 = new File("C:/Users/Pankaj Kumar/Desktop/textfile.txt");
		Stream<String> lines = Files.lines(f1.toPath()); //lines method introduced in JDK1.8
		lines.forEach(c1 -> System.out.println(c1));

}}
