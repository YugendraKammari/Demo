package collection;

import java.util.ArrayList;

public class ArrayDouble {

	public static void main(String[] args) {
		ArrayList<Double> l=new ArrayList<>();
		l.add(100.587);
		l.add(258.654);
		l.add(300.36);
		l.add(67258.69);
		l.add(76874.69);
		l.add(99999.854);
		
		System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(2));
        l.remove(100.587);
        System.out.println(l);
        System.out.println(l.contains(100.587));

	}

}
