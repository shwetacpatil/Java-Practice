package collection;

import java.util.Vector;

public class Vector_1 {
	public static void main(String[] args) {
		Vector<String> vc=new Vector<>();
		vc.add("shweta");
		vc.add("chandrakant");
		vc.add("patil");
		
		System.out.println(vc);
		
		int i=vc.size();
	    System.out.println(i);
	    System.out.println(vc.capacity());
	    vc.addElement("rekha");
	    vc.addElement("sangmesh");
	    System.out.println(vc.capacity());
	    if(vc.contains("patil")) {
	    	System.out.println("index : "+vc.indexOf("patil"));
	    }else {
	    	System.out.println("not present");
	    }
	    System.out.println(vc.firstElement());
	    System.out.println(vc.lastElement());
	    
	}

}
