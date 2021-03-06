package aasig2;

class Single {
    private static Single single_instance = null;
 
    public String s;
 
    private Single()
    {
        //s = "Hello I am a string part of Singleton class";
    }
 
    public static Single getInstance()
    {
        if (single_instance == null)
            single_instance = new Single();
 
        return single_instance;
    }
}

public class singleton {
      
	 public static void main(String args[])
	    {
	        // Instantiating Singleton class with variable x
	        Single x = Single.getInstance();
	 
	        // Instantiating Singleton class with variable y
	        Single y = Single.getInstance();
	 
	        // Instantiating Singleton class with variable z
	        Single z = Single.getInstance();
	 
	        // Printing the hash code for above variable as
	        // declared
	        System.out.println("Hashcode of x is "
	                           + x.hashCode());
	        System.out.println("Hashcode of y is "
	                           + y.hashCode());
	        System.out.println("Hashcode of z is "
	                           + z.hashCode());
	 
	        // Condition check
	        if (x == y && y == z) {
	 
	            // Print statement
	            System.out.println(
	                "Three objects point to the same memory location on the heap i.e, to the same object");
	        }
	 
	        else {
	            // Print statement
	            System.out.println(
	                "Three objects DO NOT point to the same memory location on the heap");
	        }
	    }
	}