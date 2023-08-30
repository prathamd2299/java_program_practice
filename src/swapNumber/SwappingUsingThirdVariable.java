package swapNumber;

import java.util.Scanner;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping numbers are: " + a + " " + b);
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping the numbers: " + a + " " + b);
		sc.close();
	}

}
