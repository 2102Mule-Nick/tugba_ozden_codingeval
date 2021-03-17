package com.tugba.dao;

import com.tugba.pojo.Person;

public interface PersonDao {
	
	public Person findPersonByLastName(String lastName);
	
	public Person createPerson(Person person);
	
	public void printPersonWithFamilyTree(String lastName);

}
