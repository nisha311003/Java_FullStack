package collections;

import java.util.ArrayDeque;

public class ArrayDequeEx {
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		
		a.offer(10);
		a.offer(20);
		a.offer(130);
		a.offer("Hello");
		
		System.out.println(a);
		
		a.offerFirst(5);
		System.out.println(a);
		
		a.offerLast(50);
		System.out.println(a);
		
		a.poll();
		System.out.println(a);
		
		a.pollFirst();
		System.out.println(a);
		
		a.pollLast();
		System.out.println(a);
		
		a.pop();
		System.out.println(a);
		
	}
}
