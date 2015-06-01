package CTRL;

import DB.dbConnection;
import DB.dbCustomer;
import Model.Customer;

public class CustomerCTRL {
	
	public void findByPhone(String phone){
		dbCustomer dbCus = new dbCustomer();
		dbCus.getByPhone(phone);
	}
	
	
	public void CreateCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, 
			String previousDogs, String  ref, String  eanNumber, String  gardenDescription, String  kids, String  animals, String  accommodation) throws Exception{
		
		Customer cusObj = new Customer();
		
		
	
	}
	
}
