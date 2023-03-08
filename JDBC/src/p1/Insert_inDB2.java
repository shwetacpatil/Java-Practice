package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_inDB2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/simpledb","root","test");       
			Statement stmnt=con.createStatement();
			System.out.println(" enter your name");
			String name=sc.next();
			System.out.println(" enter your city");
			String city=sc.next();
			System.out.println(" enter your email");
			String email=sc.next();
			System.out.println(" enter your mobile");
			String mobile=sc.next();
			
			
//			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
//		    stmnt.executeUpdate("delete from registration where name='"+name+"'");
//			stmnt.executeUpdate("update registration set name='"+name+"' where mobile='"+mobile+"'");
			
			ResultSet result=stmnt.executeQuery("select * from registration");
			while(result.next()) {
				System.out.print(result.getString(1));
				System.out.print(" ");
				System.out.print(result.getString(2));
				System.out.print(" ");
				System.out.print(result.getString(3));
				System.out.print(" ");
				System.out.print(result.getString(4));
				System.out.println();
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
