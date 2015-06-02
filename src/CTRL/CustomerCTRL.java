package CTRL;

import DB.dbCustomer;
import Model.Customer;


public class CustomerCTRL {
	
	public Customer findCustomer(String phone){
		dbCustomer dbCus = new dbCustomer();
		Customer cus =dbCus.getByPhone(phone);
		return cus;
	}
		
	public void createCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, 
			String previousDogs, String  ref, String  eanNumber, String  gardenDescription, String  kids, String  animals, String  accommodation) throws Exception{
		
		dbCustomer dbCus = new dbCustomer();
		dbCus.insertCustomer(firstName,  lastName, phone,  email, country, city, zipCode, address, 
				previousDogs, ref,   eanNumber,  gardenDescription, kids, animals, accommodation) ;
	}
	
	public void updateCustomer(int id){

	}
	
	

	}	


