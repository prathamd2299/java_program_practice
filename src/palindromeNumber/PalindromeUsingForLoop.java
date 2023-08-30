package palindromeNumber;

public class PalindromeUsingForLoop {

	public static void main(String[] args) {
		int originalNum, reversedNum, num;
		num = 3553;
		reversedNum = 0;
		originalNum = num;

		for (; num != 0;) {
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}

		System.out.println(reversedNum);

		if (originalNum == reversedNum) {
			System.out.println("Number is Palindrome number");
		} else {
			System.out.println("Number is not a palindrome number");
		}

	}

}
