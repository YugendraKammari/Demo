package collection;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(100, "Vishnu");
		m.put(101, "Visyu");
		m.put(102, "Vasu");
		m.put(103, "Ashok");
		m.put(104, "Sardar");
		m.put(105, "Gabbar");
		m.put(106, "Singh");
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.containsKey(103));
		System.out.println(m.get(104));
		m.remove(101);
		System.out.println(m);

	}

}
