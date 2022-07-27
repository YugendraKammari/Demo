package collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);
		l.add("A");
		l.add('b');
		l.add("Ashok");
		l.add(40000.687);
		l.add("A");
		
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		l.remove("A");
		System.out.println(l);
		System.out.println(l.contains("A"));

	}

}
