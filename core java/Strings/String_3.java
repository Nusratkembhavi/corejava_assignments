package assig3_1;

public class String_3 {

	public static void main(String[] args) 
	{
		String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		String str2 = str1.toLowerCase();
		System.out.println("lower case String: "+str2);
		
		String str3 = str1.toUpperCase();
		System.out.println("upper case String: "+str3);
		
		String str4 = str1.replace('a','$');
		System.out.println("replce String: "+str4);
		
		System.out.println(str1.contains("collection"));
		
		String str5 = "Hello";
		String str6 = "hello";
		System.out.println(str5.equalsIgnoreCase(str6));

	}

}
