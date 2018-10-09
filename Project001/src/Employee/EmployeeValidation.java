package Employee;

import java.sql.SQLException;

import javax.sql.DataSource;

public class EmployeeValidation {

	public String Validate(EmployeeDTO employeeDTO,DataSource datasource)
	{
		EmployeeCreationDAO employeeCreationDAO = new EmployeeCreationDAO();
		
		try {
		if (employeeDTO.getFname() != null && !"".equals(employeeDTO.getFname()) && employeeDTO.getLname() != null && !"".equals(employeeDTO.getLname())
				&& employeeDTO.getJobTitle() != null && !"".equals(employeeDTO.getJobTitle()) && employeeDTO.getPhNum()!= null && !"".equals(employeeDTO.getPhNum())
				&& Integer.parseInt(null, employeeDTO.getPhNum().length()) == 10 ) 
		{
			boolean validate =employeeCreationDAO.insertEmployee(datasource);
			if(validate)
			{
				System.out.println("EmployeeCreated");
				return "empcreated";
			}
			else
			{
				System.out.println("Employee Not Created");
				return "empnotcreated";
			}
		}
		else
		{
			System.out.println("inside validation");
			if (employeeDTO.getFname() == null || "".equals(employeeDTO.getFname())) {
				return "errFname";
				//request.setAttribute("errmsg", "Please enter First name");
			}
			if (employeeDTO.getLname() == null || "".equals(employeeDTO.getLname())) {
				return "errLname";
				//request.setAttribute("errmsg", "Please enter Last name");
			}
			if (employeeDTO.getJobTitle() == null || "".equals(employeeDTO.getJobTitle())) {
				return "errJobTitle";
				//request.setAttribute("errmsg", "Please enter his Job title");
			}
			if (employeeDTO.getPhNum() == null || "".equals(employeeDTO.getPhNum()) || !employeeDTO.getPhNum().matches("^[0-9]{10}$") ) {
				return "errphNum";
				//request.setAttribute("errmsg", "Please enter his Phone number");
			}
		
		}
		
		}
		
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;	
		
	}
}
