package reverseNumber;

import java.util.Scanner;

public class ReversedNumUsingRecursion {
	public static void reverseNumber(int n) {
		if (n < 10) {
			System.out.println(n);
			return;
		} else {
			System.out.print(n % 10);
			reverseNumber(n / 10);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the number that you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("The reverse of the given number is: \n");
		// method calling
		reverseNumber(num);
		sc.close();
	}
}
