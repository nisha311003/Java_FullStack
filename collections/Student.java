package collections;

public class Student {
	String name;
	int id;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+" "+name;
		
	}
}
