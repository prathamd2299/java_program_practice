package reverseNumber;

public class ReversedNumUsingForLoop {

	public static void main(String[] args) {
		int num = 123456;
		int reversedNum = 0;
		
		for(; num != 0; num = num / 10)
		{
			int rem = num % 10;
			reversedNum = reversedNum * 10 + rem;
		}
		
		System.out.println("Revrsed Number is: " + reversedNum);

	}

}
