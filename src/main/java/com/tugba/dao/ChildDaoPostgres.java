package com.tugba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tugba.pojo.Children;
import com.tugba.pojo.Person;
import com.tugba.util.ConnectionFactoryPostgres;

public class ChildDaoPostgres implements ChildDao{

	@Override
	public Children findChildrensByPerson(Person person) {
		Children children= null;
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		String sql="Select * from children where child_lastName=?";		
		
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, person.getPersonLastName());
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					children=new Children();
					children.setId(rs.getInt("children_id"));
					children.setPersonName(rs.getString("children_name"));
					children.setPersonLastName(rs.getString("children_lastName"));
										
				}
				
			
				
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		} 
			
		return children;
	}

}
