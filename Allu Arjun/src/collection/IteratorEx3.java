package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorEx3 {

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
		
		System.out.println("Using for Each Loop");
		for(String obj:l)
		{
			System.out.println(obj);
		}

	}

}
