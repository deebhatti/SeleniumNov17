package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Tokyo");
		cities.add("Paris");
		cities.add("New York");
		cities.add("London");
		cities.add("New Delhi");
		cities.add("Tokyo");
		
//		for (String t : cities) {
//			System.out.println(t);
//		}
		
		
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		int x = cities.size();
		
		System.out.println("Total number of elements = " + x);
	}

}
