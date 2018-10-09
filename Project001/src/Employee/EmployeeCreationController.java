package Employee;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import constants.Constant;
import Employee.EmployeeDTO;

@WebServlet("/EmployeeC")

public class EmployeeCreationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource datasource;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		System.out.println("inside doPost");
		employeeDTO.setFname(request.getParameter(Constant.FNAME));
		employeeDTO.setFname(request.getParameter(Constant.LNAME));
		employeeDTO.setFname(request.getParameter(Constant.GENDER));
		employeeDTO.setFname(request.getParameter(Constant.JOBTITLE));
		employeeDTO.setFname(request.getParameter(Constant.ADDLINE1));
		employeeDTO.setFname(request.getParameter(Constant.ADDLINE2));
		employeeDTO.setFname(request.getParameter(Constant.CITY));
		employeeDTO.setFname(request.getParameter(Constant.STATE));
		employeeDTO.setFname(request.getParameter(Constant.COUNTRY));
		employeeDTO.setFname(request.getParameter(Constant.PHONENUM));
		employeeDTO.setFname(request.getParameter(Constant.ALTPHNUM));
		employeeDTO.setFname(request.getParameter(Constant.DOB));
		employeeDTO.setFname(request.getParameter(Constant.BLOODGROUP));
		employeeDTO.setFname(request.getParameter(Constant.ZIPCODE));
		employeeDTO.setFname(request.getParameter(Constant.ENTRYDATE));
	
		
		EmployeeValidation employeeValidation = new EmployeeValidation();
		try {
			String ValidateMessage	= employeeValidation.Validate(employeeDTO, datasource);
		
			if (ValidateMessage.equalsIgnoreCase("empcreated"))
				response.getWriter().append("Employee Created");
			else if (ValidateMessage.equalsIgnoreCase("empnotcreated"))
			{
				request.setAttribute("errmsg", "Please Try again");
				RequestDispatcher req = request.getRequestDispatcher("CreateEmployee.jsp");
				req.include(request, response);
			}
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	}


