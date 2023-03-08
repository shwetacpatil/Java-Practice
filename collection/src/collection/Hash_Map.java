package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map extends Array{
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer, String>();
		//adding elements in map
		mp.put(1,"shweta");
		mp.put(2, "chandrakant");
		mp.put(3, "patil");
		
		//Converting to Set so that we can traverse 
		Set st=mp.entrySet();
		Iterator itr=st.iterator();
		
		while(itr.hasNext()) {
			//Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("*************");
		mp.putIfAbsent(4, "rekha");
		
		HashMap<Integer, String> mp1=new HashMap<>();
		mp1.put(5, "sangmesh");
		
		mp1.putAll(mp);
		
		Set st1=mp1.entrySet();
		Iterator it1=st1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry entry=(Map.Entry)it1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Student st0=new Student("shweta", 123, "patil");
		Student st2=new Student("shwet", 12, "pati");
		Student st3=new Student("shwe", 1, "pat");
		System.out.println("*************");
		HashMap<Integer, Student> mp2=new HashMap<>();
		mp2.put(1, st0);
		mp2.put(2, st2);
		mp2.put(3, st3);
		
		Set st4=mp2.entrySet();
		
		Iterator it2=st4.iterator();
		while(it2.hasNext()) {
		Map.Entry entry=(Map.Entry)it2.next();
		Student s=(Student) entry.getValue();
		System.out.println(entry.getKey()+" "+s.name+" "+s.rollNO+" "+s.email);
			
//	    int key=(int) entry.getKey();  
//		Student b=(Student) entry.getValue();  
//		System.out.println(key+" Details:");  
//		System.out.println(b.name+" "+b.email+" "+b.rollNO); 
		}
		
		
	}

}
