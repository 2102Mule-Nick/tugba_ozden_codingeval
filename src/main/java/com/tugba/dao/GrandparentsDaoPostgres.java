package com.tugba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tugba.pojo.Granparents;
import com.tugba.pojo.Person;
import com.tugba.pojo.Siblings;
import com.tugba.util.ConnectionFactoryPostgres;

public class GrandparentsDaoPostgres implements GrandparentsDao{

	@Override
	public Granparents findGranParentsByLastName(Person person) {
		Granparents g= null;
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		String sql="Select * from grandparents where grantparents_lastName=?";		
		
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, person.getPersonLastName());
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					g=new Granparents();
					g.setId(rs.getInt("granparents_id"));
					g.setGrandName(rs.getString("grantparents_name"));
					g.setGrandLastName(rs.getString("grantparents_lastName"));										
				}		
				
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		} 
			
		return g;
	}
	

}
