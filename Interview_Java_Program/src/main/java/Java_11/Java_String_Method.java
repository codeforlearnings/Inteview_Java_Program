package Java_11;
import java.util.stream.*;

/*
 * 1. isBlank(): This is a boolean method. It just returns true when a string is empty and vice-versa.
 * 2. lines(): This method is to return a collection of strings that are divided by line terminators.
 * 3. repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.
 * 4. stripLeading(): It is used to remove the white space which is in front of the string
 * 5. stripTrailing(): It is used to remove the white space which is in the back of the string
 * 6. strip(): It is used to remove the white spaces which are in front and back of the string
 * 
 * 
 * 
 */



public class Java_String_Method {

	public static void main(String[] args) {
		String str1 = "";
        System.out.println(str1.isBlank());
        String str2 = "GeeksForGeeks";
        System.out.println(str2.isBlank());
        
        String str3 = "Geeks\nFor\nGeeks";
        System.out.println(
        str3.lines().collect(Collectors.toList()));
        
        String str4 = "GeeksForGeeks";
        System.out.println(str4.repeat(4));
        
        String str5 = " GeeksForGeeks";
        System.out.println(str5.stripLeading());
        
        String str6 = "GeeksForGeeks ";
        System.out.println(str6.stripTrailing());
        
        String str7 = " GeeksForGeeks ";
        System.out.println(str7.strip());

	}
}
