package Java_8;

// In java 8 static methods be defined in interfaces to assist default method.

// Java interface static method is visible to interface method only.

// when implement an interface that contains a static method, the static method is still part of interface and not part of implemented class.


interface PrintDemo {
	 
    // Static Method
    static void hello()
    {
        System.out.println("Called from Interface PrintDemo");
    }
}
 
public class static_Method implements PrintDemo {
 
    public static void main(String[] args)
    {
 
        // Call Interface method as Interface
        // name is preceding with method
        PrintDemo.hello();
 
        // Call Class static method
        hello();
    }
 
    // Class Static method is defined
    static void hello()
    {
        System.out.println("Called from Class");
    }
}


//o/p:

//Called from Interface PrintDemo
//Called from Class