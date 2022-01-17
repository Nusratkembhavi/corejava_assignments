package java11_assignments;


	@FunctionalInterface
	interface si
	{
		double operation(float p, float t, float r);
	}

	public class SimpleInterest {

		public static void main(String[] args) {
			
			si s = (p,t,r)->(p*t*r)/100;
			System.out.println("Simple Interest: "+s.operation(20000, 3, 4));
		}
	}


