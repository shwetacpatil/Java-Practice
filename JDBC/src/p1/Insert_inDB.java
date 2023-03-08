package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert_inDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
		    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/simpledb","root","test");       
			Statement stmnt=con.createStatement();
			//stmnt.executeUpdate("insert into registration values('shweta3','bangalore','shweta3@gmail.com','1234')");
		    //stmnt.executeUpdate("delete from registration where name='shweta1'");
			//stmnt.executeUpdate("update registration set name='shweta1' where mobile='123'");
			
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
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				System.out.println("****");
				con.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
