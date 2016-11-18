package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		
		cities.add("Tokyo");
		cities.add("Paris");
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");
		
		for (String t : cities) {
			System.out.println(t);
		}
		
		int x = cities.size();
		
		System.out.println("Total number of elements = " + x);

		
		
	}
}
