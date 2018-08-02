
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyLambda Addfunction =( a,b) ->  a+b;
		System.out.println(Addfunction.add(4, 5) );
		
	}

interface MyLambda{
	int add(int a , int b);
}
	 
	
	
}
