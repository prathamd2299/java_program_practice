package starPattern;

public class InvertedRightAngleTriangle {

	public static void main(String[] args) {
		System.out.println("\nThe star pattern is... ");
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
