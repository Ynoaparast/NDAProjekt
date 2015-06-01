package CTRL;

import DB.dbConnection;
import DB.dbCustomer;
import Model.Customer;

public class CustomerCTRL {
	
	public void selectByPhone(String phone){
		dbCustomer dbCus = new dbCustomer();
		dbCus.getByPhone(phone);
	}
	
	
	public void CreateCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, 
			String previousDogs, String  ref, String  eanNumber, String  gardenDescription, String  kids, String  animals, String  accommodation) throws Exception{
		Customer cusObj = new Customer();
		cusObj.setFirstName(firstName);
		cusObj.setLastName(lastName);
		cusObj.setPhone(phone);
		cusObj.setEmail(email);
		cusObj.setCountry(country);
		cusObj.setCity(city);
		cusObj.setZipCode(zipCode);
		cusObj.setAddress(address);
		cusObj.setPreviousDogs(previousDogs);
		cusObj.setRef(ref);
		cusObj.setEanNumber(eanNumber);
		cusObj.setGardenDescription(gardenDescription);
		cusObj.setKids(kids);
		cusObj.setAnimals(animals);
		cusObj.setAccommodation(accommodation);
		try{
			dbConnection.startTransaction();
			dbCustomer dbCus = new dbCustomer();
			dbCus.insertCustomer(cusObj);
			dbConnection.commitTransaction();
		}
		catch(Exception e){
			dbConnection.rollbackTransaction();
			throw new Exception("Customer not inserted");
		}
	}
	
}
