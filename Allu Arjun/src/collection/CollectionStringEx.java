package collection;

import java.util.Stack;

public class CollectionStringEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s);
		
		for(String obj:s)
		{
			System.out.println(obj);
		}

	}

}
