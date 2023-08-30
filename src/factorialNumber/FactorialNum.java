package factorialNumber;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		System.out.println("Enter a number: \n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

        sc.close();
	}

}
