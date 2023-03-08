package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_hash_map extends Array{
public static void main(String[] args) {
	LinkedHashMap<Integer, String> mp=new LinkedHashMap<>();
	mp.put(1, "shweta");
	mp.put(2, "chandrakant");
	mp.put(3, "patil");
	
	System.out.println(mp.values());
	System.out.println(mp.keySet());
	System.out.println(mp.entrySet());
	
	Student st1=new Student("shweta",123,"patil");
	Student st2=new Student("shwet",12,"pati");
	Student st3=new Student("shwe",1,"pat");
	
	LinkedHashMap<Integer, Student> mp1=new LinkedHashMap<>();
	mp1.put(1, st1);
	mp1.put(2, st2);
	mp1.put(3, st3);
	
	Set st=mp1.entrySet();
	Iterator it=st.iterator();
	
	while(it.hasNext()) {
		Map.Entry entry=(Map.Entry)it.next();
		Student s=(Student) entry.getValue();
		System.out.println(entry.getKey()+" "+s.name+" "+s.rollNO+" "+s.email);
		
	}
	//same for TreeMap,HashTable
}
	
}
