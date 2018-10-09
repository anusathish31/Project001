package login;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import constants.Constant;

@WebServlet("/Login")

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource datasource;  
  
    public LoginController() {
        super();   
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean authorize = false;
		
		LoginDTO logindto=new LoginDTO();  
        logindto.setUsername(request.getParameter(Constant.UNAME));
        logindto.setPassword(request.getParameter("psw"));
		System.out.println(request.getParameter("psw"));
        
		LoginValidation loginvalidation = new LoginValidation();
		
		try {
			authorize = loginvalidation.authenticate(logindto, datasource);
			
			} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(authorize) 
        {
			System.out.println("success");
            HttpSession session=request.getSession();
            session.setAttribute("login",logindto.getUsername()); 
            RequestDispatcher rd=request.getRequestDispatcher("/homePage.jsp"); 
            rd.forward(request, response);
        }
        else
        {
        	System.out.println("wrong login");
            //request.setAttribute("WrongLoginMsg",authorize); 
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp"); 
            rd.include(request, response);
        }
	}

}
