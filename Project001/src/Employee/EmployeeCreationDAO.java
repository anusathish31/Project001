package Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import Employee.EmployeeDTO;

public class EmployeeCreationDAO {

	public boolean insertEmployee(DataSource datasource) throws SQLException {
		
		
		Connection connect=null;
		Statement stmt=null;
		int rowCount = 0;
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		try {
			System.out.println("Inside try Login DAO");
			connect=datasource.getConnection();
			System.out.println("connected");
			String insert = "insert into employee values (1, '" + employeeDTO.getFname() + "' ,'" + employeeDTO.getAddLine1() + "', '" + employeeDTO.getAddLine2()+ "', '" + employeeDTO.getCity() + "', '" + employeeDTO.getState() + "', '" + employeeDTO.getCountry() + "', '"+employeeDTO.getPhNum()+"', '"+employeeDTO.getAltPhNum()+"', null, null, null, '" + employeeDTO.getLname() + "')";
			stmt = connect.createStatement();
			System.out.println("stmt created");
			rowCount = stmt.executeUpdate(insert); 	
			System.out.println("values inserted to table employee");
			
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		if (rowCount == 1)
			return true;
		else 
			return false;
	
	}	
}
