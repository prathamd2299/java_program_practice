package arrayPrograms;

public class SmallestAndLargestNumInArray {

	public static void main(String[] args) {
		int large, small, i;
		int a[] = { 10, 20, 3, 40, 55 };
		int n = a.length;
		large = small = a[0];
		for (i = 1; i < n; i++) {
			if (a[i] > large) {
				large = a[i];
			}

			if (a[i] < small) {
				small = a[i];
			}

		}

		System.out.print("The smallest element is " + small);
		System.out.print("\nThe largest element is " + large);

	}

}
