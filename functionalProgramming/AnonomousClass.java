package functionalProgramming;

public class AnonomousClass {
	public static void main(String[] args) {
		Student s = new Student("Kavya") {
			public void display() {
				System.out.println("Hello Everyone.....!!");
			}
		};
		s.display();
	}
}

