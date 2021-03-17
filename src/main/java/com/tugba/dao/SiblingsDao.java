package com.tugba.dao;

import com.tugba.pojo.Person;
import com.tugba.pojo.Siblings;

public interface SiblingsDao {
	
	public Siblings findSiblingsByPerson(Person person);

}
