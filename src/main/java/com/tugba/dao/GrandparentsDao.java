package com.tugba.dao;

import com.tugba.pojo.Granparents;
import com.tugba.pojo.Parents;
import com.tugba.pojo.Person;

public interface GrandparentsDao {
	public Granparents findGranParentsByLastName(Person person);
}
