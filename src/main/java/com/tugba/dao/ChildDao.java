package com.tugba.dao;

import com.tugba.pojo.Children;
//import com.tugba.pojo.Parents;
import com.tugba.pojo.Person;

public interface ChildDao {
	public Children findChildrensByPerson(Person person);
}
