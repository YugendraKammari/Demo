package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx2 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("Gokul");
		l.add("Sada");
		l.add("Sudheer");
		l.add("Pradeep");
		l.add("Master");
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.contains("Sudheer"));
		System.out.println(l.size());

		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
