package primeNumber;

import java.util.Scanner;

public class PrimeNumCheckUsingWhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter a number: \n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 2;
		boolean flag = false;

		while (i <= num / 2) {
			if (num % i == 0) {
				flag = true;
				break;
			}
			++i;
		}

		if (!flag) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
		sc.close();
	}

}
