package compileTimeException;

import java.io.File;
import java.io.FileWriter;

public class IOException_2 {
	public static void main(String[] args) {
		try {
		File f=new File("C:\\Users\\shwet\\OneDrive\\Desktop\\PSA\\test1.txt"); 
		FileWriter fr=new FileWriter(f,true);
		fr.write(" ");
		fr.write("shweta");
		fr.write(" ");
		fr.write("patil");
		fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
