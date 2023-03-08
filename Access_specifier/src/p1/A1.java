package p1;

public class A1 extends B1{
	private int x=1;
    int y=2;
	protected int z=3;
	public int w=4;
public static void main(String[] args) {
	A1 a1=new A1();
	C1 c1=new C1();
	System.out.println(a1.x+" "+a1.y+" "+a1.z+" "+a1.w);
	System.out.println(a1.y1+" "+a1.z1+" "+a1.w1);
	System.out.println(c1.y2+" "+c1.z2+" "+c1.w2);
}
}
