package collections;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<>(new StudentComparator());
		set.add(new Student(1, "raj"));
		set.add(new Student(3, "aryan"));
		set.add(new Student(2, "isha"));
		
		System.out.println(set);
	}

}
