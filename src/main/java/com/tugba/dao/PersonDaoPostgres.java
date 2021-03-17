package com.tugba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;


import com.tugba.pojo.Person;
import com.tugba.util.*;

public class PersonDaoPostgres implements PersonDao{
	
	Logger log = Logger.getAnonymousLogger();

	@Override
	public Person findPersonByLastName(String lastName) {
		Person person= null;
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		String sql="Select * from person where person_lastName=?";		
		
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, lastName);
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					person=new Person();
					person.setId(rs.getInt("id"));
					person.setPersonName(rs.getString("person_name"));
					person.setPersonLastName(rs.getString("person_lastName"));
										
				}
				
			//return contents;	
				
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		} 
			//return person;
		
		return person;
	}

		
	

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPersonWithFamilyTree(String lastName) {
		
		/*String sql = "select * from person inner join parents on (person.id =parents.id) \r\n" + 
		"						inner join children on(person.id =children.id) \r\n" + 
		"						inner join siblings s on(person.id=s.id)\r\n" + 
		"					 inner join children c on(person.id=c.id)\r\n" +
		"					 inner join parents p on (person.id=p.id); " ;*/
		Person person=new Person(1,"person",lastName);
		PersonDaoPostgres personDao=new PersonDaoPostgres();
		ChildDaoPostgres  child=new ChildDaoPostgres();
		SiblingsDaoPostgres siblings=new SiblingsDaoPostgres();
		GrandparentsDaoPostgres g=new GrandparentsDaoPostgres();
		
		System.out.println("family tree");
		System.out.println(personDao.findPersonByLastName(lastName));
		System.out.println(child.findChildrensByPerson(personDao.findPersonByLastName(lastName)));
		System.out.println(siblings.findSiblingsByPerson(personDao.findPersonByLastName(lastName)));
		System.out.println(g.findGranParentsByLastName(personDao.findPersonByLastName(lastName)));
		
		
	}
	
	

}
