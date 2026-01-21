package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(16);
		set.add(18);
		set.add(32);
		set.add("Hello");
		set.add(null);
		
		System.out.println(set);
	}
}
