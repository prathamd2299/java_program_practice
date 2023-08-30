package fibonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");
			// 0, -->1st it
			//1, -->2nd it
			//1, -->3rd it
			//2 -->4th it
			//3, --> 5th it
			//5, --> 6th it
			//8, --> 7th it

			// compute the next term
			int nextTerm = firstTerm + secondTerm; 
			//0 + 1 = 1, --> 1st it
			//1 + 1 = 2 --> 2nd it
			//1 + 2 = 3, --> 3rd it
			//2 + 3 = 5 --> 4th it
			//3 + 5  = 8 --> 5th it 
			//5 + 8 = 13, --> 6th it
			//8 + 13 = 21, --> 7th it
			firstTerm = secondTerm;// f = 1, -->1st it
			//f = 1, --> 2nd it
			//f = 2, --> 3rd it
			//f = 3, --> 4th it
			//f = 5, --> 5th it
			//f = 8, --> 6th it
			//f = 13, --> 7th it
			secondTerm = nextTerm;//s = 1, -->1st it
			//s = 2, -->2nd it
			//s = 3, -->3rd it
			//s = 5, -->4th it
			//s = 8, --> 5th it
			//s = 13, --> 6th it
			//s = 21, --> 7th it
		}

	}

}
