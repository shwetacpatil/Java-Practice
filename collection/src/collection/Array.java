package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
public String name;
public int rollNO;
public String email;

public Student(String name, int rollNO, String email) {
	super();
	this.name = name;
	this.rollNO = rollNO;
	this.email = email;
}
	
}
public class Array {
	public static void main(String[] args) {
		//creating array list
		ArrayList<String> str=new ArrayList<String>();
		
		//List<String> str2=new ArrayList<String>();
		str.add("shweta");
		str.add("rekha");
		str.add("chandrakant");
		str.add("sangmesh");
		
		//printing array list
		System.out.println(str);	
		System.out.println("***************");
		
		//traversing through array
		Iterator<String> itr = str.iterator();
		
		//Iterator itr2=str.iterator();
		
        //printing array using while loop
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***************");
		
		//we can add one array into another by following 
		ArrayList<String> str3=new ArrayList<String>(str);
		str3.add("newarray");
		System.out.println(str3);
		
		System.out.println("***************");
		
		//printing array using for loop
		for(String str1:str) {
			System.out.println(str1);
		}
		System.out.println("***************");
		
		//for accessing any array 
		System.out.println("Get the rekha name "+str.get(1));
		System.out.println("***************");
		
		//setting values in array
		str.set(0,"shwetu");
		
		//printing array using for loop
		for(String str1:str) {
			System.out.println(str1);
		}
		System.out.println("***************");
		
		//sorting of array
		Collections.sort(str);
		
		//printing sorted array
		for(String str1:str) {
			System.out.println(str1);
		}
		System.out.println("***************");
		
		//to print reverse of array
		ListIterator<String> str1 = str.listIterator(str.size());
		while(str1.hasPrevious()) {
			System.out.println(str1.previous());
		}
		
		//printing array using for loop
		System.out.println("***************");
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		//Creating custom class 
		Student s1=new Student("shweta",1,"shweta123");
		Student s2=new Student("shwet",2,"shweta12");
		Student s3=new Student("shwe",3,"shweta1");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//traversing through array
		Iterator<Student> itr1 = list.iterator();
		while(itr1.hasNext()) {
			Student st=(Student)itr1.next();
			System.out.println(st.name+" "+st.email+" "+st.rollNO);
		}
//		another way to traverse array
//		for(Student st:list) {
//			System.out.println(st.email+" "+st.name+" "+st.rollNO);
//		}
		System.out.println("***************");
		
		ArrayList<String> str2=new ArrayList<String>();
		str2.add("hello");
		str2.add("world");
		str2.add("byee");
		str2.add("shwetu");
		
		str.addAll(str2);
		
        Iterator<String> itr3 = str.iterator();
		
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("***************");
	   
		//remove any array
		str.remove(6);
		System.out.println(str);
		System.out.println("***************");
		
		//to remove all use 
		str.removeAll(str2);
		System.out.println(str);
		System.out.println("***************");
		//to clear all
//		str.clear();
//		System.out.println(str);
//			
//		System.out.println("***************");
//		
//		str.retainAll(str2);
//		System.out.println(str);
		
		// check whether it is empty or not 
		System.out.println("***************");
		System.out.println(str.isEmpty());
		
	}


}
