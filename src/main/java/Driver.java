import com.tugba.dao.PersonDaoPostgres;

public class Driver {
	
	public static void main(String[] args) {
		
		PersonDaoPostgres personDaoPostgres=new PersonDaoPostgres();
		
		
		System.out.println(personDaoPostgres.findPersonByLastName("Bob"));
	}

}
