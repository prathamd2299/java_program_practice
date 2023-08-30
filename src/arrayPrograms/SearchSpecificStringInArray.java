package arrayPrograms;

public class SearchSpecificStringInArray {

	public static void main(String[] args) {
		String b[] = {"apple","mango","banana","grapes","orange"};
		String str = "mangos";
		boolean found = false;
		for(int i = 0; i < b.length; i++)
		{
			if(str == b[i])
			{
				found = true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("String is found");
		}
		else
		{
			System.out.println("String is not found");
		}

	}

}
