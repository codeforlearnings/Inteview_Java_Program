package General_Program;

public class Sum_of_no_zero_in_Array {

	public static void main(String[] args) {
		 int givenArray[] = {1, 2, 4, -3, -1, 5, 6};

	        for (int i = 0; i < givenArray.length; i++) {
	            for (int j = i + 1; j < givenArray.length; j++) {
	                for (int k = j + 1; k < givenArray.length; k++) {
	                    if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
	                        System.out.println("Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
	                    }
	                }}}}}


