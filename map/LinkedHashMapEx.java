package map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		
		map.put(1, "ravi");
		map.put(2, "isha");
		map.put(33, "ishan");
		
		System.out.println(map);
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}
}
