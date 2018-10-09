package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class LoginDAO {
	public List<LoginDTO> retriveEmployeeList(DataSource datasource) throws SQLException {
		List <LoginDTO> logindtolist = new ArrayList<>();
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			System.out.println("Inside try Login DAO");
			connect=datasource.getConnection();
			System.out.println("connected");
			String select = "Select user_name, password from anu.users";
			stmt = connect.createStatement();
			System.out.println("stmt created");
			rs = stmt.executeQuery(select);
			System.out.println("stmt executed");
			while (rs.next()) 
			{
				System.out.println("Inside while Login DAO");
				
				LoginDTO logindto = new LoginDTO();
				
				logindto.setUsername(rs.getString("user_name"));
				
				logindto.setPassword(rs.getString("password"));
					
				
				logindtolist.add(logindto);
			}
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		return logindtolist;
		
	}
}
