package compileTimeException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffer_1 {
    
	
	public static void main(String[] args) {
		
		try {
			File f=new File("C:\\Users\\shwet\\OneDrive\\Desktop\\PSA\\test1.txt"); 
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("shweta patil#");
		
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
