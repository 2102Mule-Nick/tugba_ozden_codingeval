package com.tugba.dao;

import com.tugba.pojo.Parents;
import com.tugba.pojo.Person;

public interface ParentsDao {
	
	public Parents findParentsByLastName(Person person);

}
