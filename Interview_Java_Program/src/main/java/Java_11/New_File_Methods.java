package Java_11;

import java.io.IOException;
import java.nio.file.*;

/*
 * 1. writeString(): This is to write some content in a file.
 * 2. readString(): This is used to read the contents of a file.
 * 3. isSameFile(): This method is used to know whether two paths locate the same file or not.
 * 
 * 
 * 
 */

public class New_File_Methods {

	public static void main(String[] args) throws IOException {
	
	Files.writeString(Path.of("C:/Users/Pankaj Kumar/Desktop/textfile.txt"), "Hi writing is sucessfull");
		
	String str2=	Files.readString(Path.of("C:/Users/Pankaj Kumar/Desktop/textfile.txt"));
	System.out.println("Readable data is - "+str2);
	
	Boolean b=Files.isSameFile(Path.of("C:/Users/Pankaj Kumar/Desktop/textfile.txt"), Path.of("C:/Users/Pankaj Kumar/Desktop/textfile.txt"));
    System.out.println(b);
	}
}
