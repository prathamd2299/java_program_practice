package arrayPrograms;

public class SearchSpecificNumInArray {

	public static void main(String[] args) {
		int b[] = {45,32,98,76,34};
		int num = 45;
		boolean found = false;
//		for(int i = 0; i < b.length; i++)
//		{
//			if(num == b[i])
//			{
//				found = true;
//				break;
//			}
//		}
		
		for(int n : b)
		{
			if(n == num)
			{
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Number is found");
		}
		else 
		{
			System.out.println("Number is not found");
		}

	}

}
