package lamada_assignment;
import java.util.Arrays;
import java.util.List;

public class assign_2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Orders> orders=Arrays.asList(new Orders(3455),
					new Orders(545666),
					new Orders(50000));
		orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));
			
		
		
		}
	}


