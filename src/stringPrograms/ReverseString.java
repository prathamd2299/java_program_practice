package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// declaring variable
		String stringinput = "Aniket Yash";
		System.out.println(stringinput.length());
		
		// convert String to character array
		// by using toCharArray method
		char[] resultarray = stringinput.toCharArray();

		// iteration
		for (int i = resultarray.length - 1; i >= 0; i--)

			// print reversed String

			System.out.print(resultarray[i]);

	}

}
