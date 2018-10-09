package login;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public class LoginValidation {

	
	public Boolean authenticate(LoginDTO logindto, DataSource datasource) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(datasource);
		System.out.println("Inside Authenticate");
		boolean flag=false;
		LoginDAO loginDAO = new LoginDAO();
		System.out.println("loginval-dao obj got created");
		List<LoginDTO> loginList = loginDAO.retriveEmployeeList(datasource);
		
		for(LoginDTO dto : loginList) {
			System.out.println("Inside Login validation for loop");
			System.out.println(logindto.getUsername());
			System.out.println(dto.getUsername());
			System.out.println(logindto.getPassword());
			System.out.println(dto.getPassword());
			if(logindto.getUsername().equals(dto.getUsername()) && logindto.getPassword().equals(dto.getPassword())) {
				
				flag=true;
			}
		}
		
		
		return flag;
	}
}
