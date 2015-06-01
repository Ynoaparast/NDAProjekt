package CTRLLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelLayer.*;
import DBLayer.*;

public class CustomerCTRL {
	
	
	public void insertNew(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, String previousDogs, String ref, String eanNumber, String gardenDescription, String kids, String animals, String accommodation) throws Exception
    {    
        Customer cusObj = new Customer();
        cusObj.setFirstName(firstName);
        cusObj.setLastName(lastName);
		cusObj.setPhone(phone);
		cusObj.setEmail(email);
		cusObj.setCountry(country);
		cusObj.setCity(city);
		cusObj.setZipCode(zipCode);
		cusObj.setAddress(address);
		cusObj.setPrevDogs(previousDogs);
		cusObj.setRef(ref);
		cusObj.setEanNumber(eanNumber);
		cusObj.setGardenDescr(gardenDescription);
		cusObj.setAccommodation(accommodation);
  
         try{
          dbConnection.startTransaction();
          CustomerDB dbCus = new CustomerDB();
          dbCus.insertCustomer(cusObj);
          dbConnection.commitTransaction();
         }
         catch(Exception e)
         {
        	 dbConnection.rollbackTransaction();
             throw new Exception("Employee not inserted");
         }
    }
	
	
}
