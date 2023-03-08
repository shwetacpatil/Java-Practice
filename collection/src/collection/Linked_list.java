package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Linked_list extends Array{
	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		
		str.add("shweta");
		str.add("rekha");
		str.add("chandrakant");
		str.add("sangmesh");
		
		System.out.println("*************");
		Iterator<String> i=str.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		LinkedList<String> str2=new LinkedList<String>();
		str2.add("shweta");
		str2.add("patil");
		str2.add("ssh");
		
		
		System.out.println("*************");
		LinkedList<String> str3=new LinkedList<String>(str2);
		str3.add("ss");
		//Iterator<String> i=str3.iterator();
		for(String st:str3) {
			System.out.println(st);
		}
		System.out.println("*************");
		Iterator<String> itr = str.iterator();
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*************");
		for(String str1:str2) {
			System.out.println(str1);
		}
		
		System.out.println("*************");
		str.addAll(str2);
		System.out.println(str);
		System.out.println("*************");
		
		str.addFirst("First");
		str.addLast("last");
		System.out.println(str);
		System.out.println("*************");
		
		str.remove(0);
		str.remove(str.size()-1);
		str.removeAll(str2);
		System.out.println(str);
		System.out.println("*************");
		
		Student st1=new Student("shweta",1,"patil");
		Student st2=new Student("shwet",2,"pati");
		Student st3=new Student("shwe",3,"pat");
		
		LinkedList<Student> list1=new LinkedList<Student>();
		list1.add(st1);
		list1.add(st2);
		list1.add(st3);
		
		Iterator<Student> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Student st=(Student)itr1.next();
			System.out.println(st.name+" "+st.email+" "+st.rollNO);
		}
		System.out.println("*************");
		Collections.sort(str);
		System.out.println(str);
		
	}

}
