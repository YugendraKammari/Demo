package collection;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationEx2 {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s);
		
		Enumeration<String> e=s.elements();
	    while(e.hasMoreElements())
	    {
	    System.out.println(e.nextElement());
	    }
		

	}

}
