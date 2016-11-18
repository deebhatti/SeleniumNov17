package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer>  td = new HashMap<>();
		
		td.put("Tim", 123456);
		td.put("Steve", 654321);
		td.put("Sam", 987654);
		
		for (Map.Entry m: td.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		
	}

}
