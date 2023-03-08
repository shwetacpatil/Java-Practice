package p1;

import java.sql.ResultSet;

public interface DAOService {

	public void connectDB();
	public boolean varifyLogin(String email, String password);
	public void saveRegistration(String name,String city,String email,String mobile);
	public ResultSet listAll();
	public void deleteRegistration(String email);
	public void updateRestration(String email,String mobile);
}
