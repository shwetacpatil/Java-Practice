package collection;

import java.util.Stack;

public class Stack_1 {
public static void main(String[] args) {
	Stack<String> st=new Stack<>();
	st.push("shweta");
	st.push("chandrakant");
	st.push("patil");
	System.out.println("stack ->"+st);
	String st1=st.pop();
	System.out.println(st1);
	System.out.println("stack ->"+st);
	boolean b=st.empty();
	System.out.println(b);
	String b1=st.peek();
	System.out.println(b1);
	
	st.push("rekha");
	
	System.out.println(st);
	st.removeAllElements();
	System.out.println(st.empty());
}
	
}
