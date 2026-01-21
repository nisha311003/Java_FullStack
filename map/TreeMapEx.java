package map;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		
		map.put(1, "ravi");
		map.put(60, "nisha");
		map.put(61, "isha");
		map.put(2, "isha");
		map.put(33, "ishan");
		
		System.out.println(map);
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}
}
