package p1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add")
public class Add_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Add_Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		try {
		RequestDispatcher rd=request.getRequestDispatcher("Add_numbers.jsp");
		rd.forward(request, response);
		
		Add_numbers ac=new Add_numbers();
		int n=ac.add(n1,n2);
		
		System.out.println(n);
		
		request.setAttribute("n", n);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}

}












