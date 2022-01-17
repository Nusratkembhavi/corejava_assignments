package lamada_assignment;

import java.util.function.*;

public class assign_3{
	public static void main(String[] args) {
		Consumer<Integer> C = i -> System.out.println(i);
		Predicate<Integer> P = i ->(i>10);
		Supplier<Double> S = ()->Math.random();
		Function<Integer,Double> F=(a)->a/2.0;
		System.out.println("Consumer");
		C.accept(29);
		System.out.println(P.test(29));
		System.out.println("Supplier:"+ S.get());
		System.out.println("Supply:"+F.apply(70));
	}
	
}