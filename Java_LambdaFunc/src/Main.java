import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k[] = new int[] {1,4,5,6,7};
		String v[] = new String[]{"a","k","x","p"};

	      java.util.List<String> list1 = Arrays.asList(v);
	      	Collections.sort(list1);

	      // printing the list
	      System.out.println("The list is:" + list1);
		
		MyLambda Addfunction = (a, b) -> a + b;
		System.out.println(Addfunction.add(4, 5));

	}

	interface MyLambda {
		int add(int a, int b);
	}
	
	
}

