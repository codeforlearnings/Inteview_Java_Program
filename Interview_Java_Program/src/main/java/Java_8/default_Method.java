package Java_8;

//Java provides a facility to create default methods inside the interface.
//These methods are non-abstract methods.

public class default_Method implements TestInterface{
	
	 public static void main(String args[])
	  {
	   // default method executed
		 default_Method t=new default_Method();
	     t.show();
	  }}

interface TestInterface
{
  default void show()
  {
    System.out.println("Default Method Executed");
  }
}

//o/p: Default Method Executed
