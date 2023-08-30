package arrayPrograms;

public class SumOfArrayValues {

	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
			sum = sum + a[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);

	}

}
