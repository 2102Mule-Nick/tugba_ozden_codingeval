package com.tugba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tugba.pojo.Children;
import com.tugba.pojo.Person;
import com.tugba.pojo.Siblings;
import com.tugba.util.ConnectionFactoryPostgres;

public class SiblingsDaoPostgres implements SiblingsDao{

	@Override
	public Siblings findSiblingsByPerson(Person person) {
		Siblings siblings= null;
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		String sql="Select * from siblings where sibling_lastName=?";		
		
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, person.getPersonLastName());
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					siblings=new Siblings();
					siblings.setId(rs.getInt("siblings_id"));
					siblings.setSiblingName(rs.getString("sibling_name"));
					siblings.setSiblingLastName(rs.getString("sibling_lastName"));										
				}		
				
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		} 
			
		return siblings;
	}
	

}
