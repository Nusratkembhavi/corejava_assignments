package genrics_aasig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class assig_3 {
		public static final <N> void swap (N[] a, int i, int j) {
		N n = a[i];
		a[i] = a[j];
		a[j] = n;
		}

		public static final <N> void swap (List<N> l, int i, int j) {
		Collections.<N>swap(l, i, j);
		}

		private static void test() {
		String [] a = {"nusrat", "kembhavi"};
		swap(a, 0, 1);
		System.out.println("a:"+Arrays.toString(a));
		List<String> l = new ArrayList<String>(Arrays.asList(a));
		swap(l, 0, 1);
		System.out.println("l:"+l);
		}
		public static void main(String...args)
		{
		test();
		}

		}


