package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("shweta");
		hs.add("chandrakant");
		hs.add("patil");
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**************");
		
		
	}

}
