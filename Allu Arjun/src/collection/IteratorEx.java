package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("A");
		l.add("Vishnu");
		l.add("Gokul");
		l.add("Surya");
		l.add("A");
		
		System.out.println(l);
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
