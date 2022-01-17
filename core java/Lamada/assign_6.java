package lamada_assignment;

//import java.util.Arrays;
//import java.util.List;
//import java.util.function.UnaryOperator;
//public class assign_6 {
//
//	public static void main(String[] args) {
//		String arr[]= {"nusrat","kembhavi","archana","bohramma"};
//		List<String> arrayList=Arrays.asList(arr);
//		arrayList.replaceAll(e->e.toUpperCase());
//		System.out.println(arrayList);
//		
//	}
//
//}


import java.util.*;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

class assign_6 implements  UnaryOperator<String>{
	public String apply(String str) {
		return str.toUpperCase();
	}
}




