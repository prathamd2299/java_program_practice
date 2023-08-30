package reverseNumber;

public class ReversedNumUsingWhileLoop {

	public static void main(String[] args) {
		int num = 75364;
		int reversedNum = 0;
		int rem;
		
		while(num != 0)
		{
			rem = num % 10;
			reversedNum = reversedNum * 10 + rem;
			num = num / 10;
		}
		
		System.out.println("Reversed Number is: " + reversedNum);

	}

}
