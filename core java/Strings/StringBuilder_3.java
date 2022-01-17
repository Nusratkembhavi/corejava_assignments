package assig3_1;

public class StringBuilder_3 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println("Original string: "+s);
		s.reverse();
		System.out.println("Reversed string: "+s);

	}

}
