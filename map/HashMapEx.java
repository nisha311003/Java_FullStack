package map;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1,  "shraddha");
		map.put(2,  "kavya");
		map.put(3,  "Suraj");
		map.put(4,  "Bharati");
		map.put(51,  "Ravi");
		map.put(50, "Shraddha");
		
		map.putIfAbsent(50, null);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Object o: map.entrySet()) {
			System.out.println(o);
		}
		
		for(Object o: map.keySet()) {
			System.out.println(o);
		}
	}

}
