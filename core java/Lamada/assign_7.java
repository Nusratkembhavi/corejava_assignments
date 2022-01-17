package lamada_assignment;



import java.util.HashMap;
import java.util.Map.Entry;

public class assign_7
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(1, "India");
		hs.put(2, "South Korea");
		hs.put(3, "Srilanka");
		hs.put(4, "Mayanmar");
		System.out.println("The elements in the hashmap are:");
		System.out.println(hs);		
		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m); //Original string is changed
		}
		System.out.println(sb);
		
	}

}