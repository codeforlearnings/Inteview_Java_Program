package General_Program;

 class Custom_Exception extends Exception {
	// A Class that represents use-defined exception
	
	    public Custom_Exception(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
	}
	 
	// A Class that uses above MyException
	public class Custom_Exception_Handling {
	    // Driver Program
	    public static void main(String args[])
	    {
	        try {
	            // Throw an object of user defined exception
	            throw new Custom_Exception("GeeksGeeks");
	        }
	        catch (Custom_Exception ex) {
	            System.out.println("Caught");
	 
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }
	    }
	}


