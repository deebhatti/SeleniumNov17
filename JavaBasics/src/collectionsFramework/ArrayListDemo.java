package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Tokyo");
		cities.add("Paris");
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");
		
		for (String a : cities) {
			System.out.println(a);
		}
		
		//Adding a comment in line number 19
		
		int x = cities.size();
		
		System.out.println("Total number of elements = " + x);
		
		
		
	}

}
