package collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(100);
		v.add(1051);
		v.add(2054);
		v.add(8524);
		v.add(500);
		v.add(400);
		System.out.println(v);
		System.out.println(v.get(2));
		System.out.println(v.contains(2054));
		System.out.println(v.size());
        v.remove(1);
        System.out.println(v);

	}

}
