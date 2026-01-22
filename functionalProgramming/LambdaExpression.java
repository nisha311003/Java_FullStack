package functionalProgramming;

public class LambdaExpression {
	public static void main(String[] args) {
		A a = ()->System.out.println("Hiii");
		a.test();
		B b = (x, y)-> {
			return x+y;
		};
		
		System.out.println(b.add(10, 20));
	}
}
interface A{
	void test();
}
interface B{
	int add(int a ,int b);
}
