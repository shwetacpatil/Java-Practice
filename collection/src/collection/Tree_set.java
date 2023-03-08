package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("shweta");
		ts.add("patil");
		ts.add("chandrakant");
		ts.add("rekha");
		ts.add("sangmesh");
		ts.add("shweta");
		
		System.out.println(ts);
		
		System.out.println("*************");
		
		Iterator<String> i=ts.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("*************");
//		System.out.println("lowest val "+ts.pollFirst());
//		System.out.println("highest val "+ts.pollLast());
		System.out.println("*************");
		
		System.out.println(ts);
		System.out.println("Reverse set "+ ts.descendingSet());
		System.out.println("head set "+ ts.headSet("sangmesh", true));
		System.out.println("tail set "+ ts.tailSet("patil", false));
	    System.out.println("subset "+ ts.subSet("patil", false, "shweta", true));
	    
	    
	}
	

}
