package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("A");
		l.add("Vishnu");
		l.add("Gokul");
		l.add("Surya");
		l.add("A");
		
		System.out.println(l);
		
		ListIterator<String> itr=l.listIterator();
		System.out.println("Elements in Forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
        
		System.out.println("Elements in Backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
