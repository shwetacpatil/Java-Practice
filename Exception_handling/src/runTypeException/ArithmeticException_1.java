package runTypeException;

public class ArithmeticException_1 {
	static ArithmeticException_1 a2;//null
    int x=10;
    int y;
	public static void main(String[] args) {
		ArithmeticException_1 a1=new ArithmeticException_1();
		try {
			int z=a1.x/a1.y;
			System.out.println(z);
		}catch(ArithmeticException e) {
			System.out.println("****Alert*****");
			e.printStackTrace();
		}finally {
			try {
				System.out.println(a2.x);
			}catch(NullPointerException e) {
				System.out.println("****alert*****");
				e.printStackTrace();
			}
				
			
		}
		
		
		
		
	}
}
