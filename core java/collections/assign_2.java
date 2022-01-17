package collections_assignment;
import java.util.*;

public class assign_2 {

	public static void main(String[] args) {
		 biscuit b1 = new biscuit("parle-g");
   	  biscuit b2 = new biscuit("oreo");
   	  biscuit b3 = new biscuit("good-day");
   	biscuit b4 = new biscuit("hide&seek");
   	biscuit b5 = new biscuit("happy");
   	biscuit b6 = new biscuit("dark-fantasy");
   	biscuit b7 = new biscuit("sunfeast");
   	biscuit b8 = new biscuit("maria");
   	biscuit b9 = new biscuit("boost");
   	biscuit b10 = new biscuit("50-50");
   	  
   	  HashSet<biscuit> h = new HashSet<>();
   	  h.add(b1);
   	  h.add(b2);
   	  h.add(b3);
   	  h.add(b4);
   	 h.add(b5);
   	 h.add(b6);
   	 h.add(b7);
   	 h.add(b8);
   	 h.add(b9);
   	 h.add(b10);
   
   	  Iterator<biscuit> i = h.iterator();
   	  while (i.hasNext())
   		  System.out.println(i.next());
   	  
   	   h.add(b3);  
   		  System.out.println("already added, duplicates will not be added");	  
	}		
}
class biscuit
{
	private String biscuit_name;
	public biscuit(String biscuit_name) {
		super();
		this.biscuit_name = biscuit_name;
	}
	public String getbiscuit_name() {
		return biscuit_name;
	}
	@Override
	public String toString() {
		return " [biscuit_name = " + biscuit_name + "]";
	}
}

	


