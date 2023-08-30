package arraylistPrograms;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("pratham");
		s.add("sharad");
		s.add("yash");
		s.add("anant");
		
		System.out.println(s);
		s.add("nikhil"); //adding at the end
		System.out.println(s); //to print arraylist
		System.out.println(s.size()); //to get size 
		System.out.println(s.get(2));
		s.set(1, "payal");
		System.out.println(s);
		s.add(1, "ganesh");
		System.out.println(s);
		s.remove(3);
		System.out.println(s.contains("yash"));
		System.out.println(s);
		
		for(int i = 0; i < s.size(); i++)
		{
			System.out.print(s.get(i) + " ");
		}
		System.out.println();
		for(String a : s)
		{
			System.out.print(a + " ");
		}
		s.clear();
		System.out.println(s);

	}

}
