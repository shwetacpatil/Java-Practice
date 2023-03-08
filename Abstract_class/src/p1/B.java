package p1;

public class B extends Abstract_class1 implements A ,C{
     
	
	@Override
	public void test5() {
		System.out.println("overrided from C");
	}
	@Override
	public void test4() {
		System.out.println("overrided from A");
	}
	@Override
	public void test2() {
		super.test2();
	}
	@Override
	public void test1() {
		System.out.println("overrided abstract method from abstract class ");
	}
	@Override
	public void test3() {
		System.out.println("overrided abstract method from abstract class ");
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test1();
		b1.test2();
		b1.test3();
		b1.test4();
		b1.test5();
	}
}
