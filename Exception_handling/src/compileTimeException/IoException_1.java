package compileTimeException;

import java.io.File;
import java.io.FileReader;
public class IoException_1 {

	public static void main(String[] args) {
		try {
		File f=new File("C:\\Users\\shwet\\OneDrive\\Desktop\\PSA\\test1.txt"); 
		FileReader fr=new FileReader(f);
		for(int i=0;i<f.length();i++) {
			System.out.print((char)fr.read());
		}
		
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		
		for(char s:ch) {
			System.out.print(s);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
