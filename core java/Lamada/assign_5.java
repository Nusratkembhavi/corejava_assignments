package lamada_assignment;


	import java.util.ArrayList;
	import java.util.List;

	public class assign_5 {
	  public static void main(String[] args) {
		  List<String> names = new ArrayList<>();
		  names.add("Kim Namjoon");
		  names.add("Kim Sukjin");
		  names.add("Min Yoongi");
		  names.add("Jouh Hoeshok");
		  names.add("Park Jimin");
		  names.add("Kim Teheahungh");
		  names.add("Jhon Jugnhook");
		  names.add("BTS");
		  
		  StringBuilder result = new StringBuilder();
		  names.forEach(s->result.append(s.charAt(0)));
		  System.out.println(result);
	  }
	  
	}

