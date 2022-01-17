package lamada_assignment;
import java.util.*;
public class assign_4 {

	public static void main(String[] args) {
      
		ArrayList<String> n = new ArrayList<>();
		n.add("Nusrat");
		n.add("Kembhavi");
		n.add("Swaroop");
		n.add("Bhavani");		
		n.add("Shurusti");
		n.add("Rutuja");
		System.out.println("Before removing : "+n);
		n.removeIf(name->(name.length()%3!=0));
		System.out.println("After removing : "+n);
		
		
	}

}