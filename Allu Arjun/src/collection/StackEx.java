package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		
		

	}

}
