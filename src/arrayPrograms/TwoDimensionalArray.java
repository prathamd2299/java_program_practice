package arrayPrograms;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int a[][] = new int [3][2];
		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 40;
		a[1][1] = 50;

		a[2][0] = 70;
		a[2][1] = 80;
//		a[2][2] = 90;*/
		
		int a[][] = {
				{100,200,900}, 
				{300,400,800}, 
				{500,600} 
				};
		System.out.println("Number of rows: " + a.length); //printing number of rows
		System.out.println("Number of columns: " + a[0].length); //printing number of columns
		System.out.println("\nPrinting array values using for loop");
		//reading values from array using for loop
		for(int i = 0; i < a.length; i++) //outer loop 0 1 2
		{
			for(int j = 0; j < a[i].length; j++) //inner loop 0 1
			{
				System.out.print(a[i][j] + " "); // 100 200 300 400 500 600
			}
			System.out.println();
		}
		System.out.println("\nPrinting array values using for each loop");
		//reading values from array using for each loop
		for(int r[] : a) //{100,200} -> {300,400} -> {500,600}
		{
			for(int i : r) //100 -> 200, 300 -> 400, 500 -> 600
			{
				System.out.print(i + " "); //100 200 300 400 500 600
			}
			System.out.println();
		}

	}

}
