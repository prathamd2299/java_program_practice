package starPattern;

public class SquarePatternNum {

	public static void main(String[] args) {
		int size = 5;
		for(int i = 1; i < size; i++)
		{
			for(int j = 1; j < size; j++)
			{
				System.out.print(" " + i);
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		int size1 = 6;
		for(int i = 1; i < size1; i++)
		{
			for(int j = 1; j < size1; j++)
			{
				System.out.print(" " + j);
			}
			System.out.println();
		}

	}

}
