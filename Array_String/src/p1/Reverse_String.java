package p1;

public class Reverse_String {
	public void check(String str) {
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==')') {
			x++;
		}else {
			y++;
		}
		}
		
		if(x==y) {
			System.out.println("brackets are equal");
		}else {
			System.out.println("brackets are not equal");
		}
	}
public static void main(String[] args) {
	Reverse_String r=new Reverse_String();
	
	String str1="(()()()))((()";
	String str="shweta patil";
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
    System.out.println();
	String[] s=str.trim().split(" ");
	for(String x:s) {
		System.out.println(x);
	}
	String str2="(())";
	r.check(str2);
	r.check(str1);
}
	
}
