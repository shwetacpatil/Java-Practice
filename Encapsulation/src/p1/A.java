package p1;

public class A extends B{
public static void main(String[] args) {

	A a1=new A();
	a1.setId(1);
	a1.setName("shweta");
	a1.setEmail("shweta@123");
    int i= a1.getId();
    System.out.println(i);
    String s1=a1.getName();
    System.out.println(s1);
    String s2=a1.getEmail();
    System.out.println(s2);
}
}
