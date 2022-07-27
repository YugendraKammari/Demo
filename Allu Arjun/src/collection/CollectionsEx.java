package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("Arundhati");
		l.add("Vishnu");
		l.add("Gokul");
		l.add("Surya");
		l.add("Ashwin");
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After Sorting");
		System.out.println(l);
		
		System.out.println("Search Vishnu:"+Collections.binarySearch(l,"Vishnu"));
	    Collections.reverse(l);
	    System.out.println("After Reversing");
	    System.out.println(l);
	    
		

	}

}
