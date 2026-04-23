package dao;

import java.sql.Connection;

public class CustomerDAO extends DAO{
	public Customer search(String login, String password)
	    throws Exception {
		Customer customer=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;  
		st=con.prepareStatement(password)
	}

}
