package primeNumber;

import java.util.Scanner;

public class PrimeNumCheckUsingForLoop {

	public static void main(String[] args) {
		System.out.println("Enter a number: \n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			// condition for non prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}

		sc.close();
	}

}
