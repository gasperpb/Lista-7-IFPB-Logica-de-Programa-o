package exercises2;

public class TriangularNumber_Iterative {

	public static void run() {
		
		int n = 60;
		int number = triangular_it(n);
		
		System.out.println(String.format(
				"The %sth triangular number: %s", 
				n, number));
	}

	private static int triangular_it(int value) {
		
		int result = 0;
		
		while(value > 0) {
			
			result = result + value;
			value = value - 1;
		}
		
		return result;
	}
}






