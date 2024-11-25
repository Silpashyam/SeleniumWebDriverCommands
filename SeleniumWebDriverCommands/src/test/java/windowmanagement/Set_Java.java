package windowmanagement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Java {

	public static void main(String[] args) {
		// holds unique elements
		// no final size
		// no index
		// no order in set
		Set<String> s = new HashSet<String>();
		System.out.println("Size - "+s.size());
		s.add("India");
		s.add("USA");
		s.add("Japan");
		s.add("Japan");
		System.out.println("Size - "+s.size());
		//System.out.println(s.get(0));
		Iterator<String> it = s.iterator();
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
	
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}

}
