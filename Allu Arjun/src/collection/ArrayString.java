package collection;

import java.util.ArrayList;

public class ArrayString {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<>();
		l.add("A");
		l.add("Vishnu");
		l.add("Gokul");
		l.add("Surya");
		l.add("A");
		
		System.out.println(l);
		
		System.out.println(l.get(2));
		System.out.println(l.size());
		l.remove("A");
		System.out.println(l);
		System.out.println(l.contains("A"));

	}

}
