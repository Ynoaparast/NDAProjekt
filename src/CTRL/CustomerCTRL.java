package CTRL;

import DB.dbCustomer;


public class CustomerCTRL {
	
	public void findCustomer(String phone){
		dbCustomer dbCus = new dbCustomer();
		dbCus.getByPhone(phone);	
	}
		
	public void createCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, 
			String previousDogs, String  ref, String  eanNumber, String  gardenDescription, String  kids, String  animals, String  accommodation) throws Exception{
		
		dbCustomer dbCus = new dbCustomer();
		dbCus.insertCustomer(firstName,  lastName, phone,  email, country, city, zipCode, address, 
				previousDogs, ref,   eanNumber,  gardenDescription, kids, animals, accommodation) ;
	}
	
	public void updateCustomer(){
		
	}	
}
