package DBLayer;
import ModelLayer.*;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDB implements IFDBCus {

	private Connection con;
	
	public CustomerDB(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	private Customer buildCustomer(ResultSet results)
    {   Customer CustomerObj = new Customer();
        try{ // the columns from the table Customer are used
        	
        	CustomerObj.setFirstName(results.getString("firstName"));
        	CustomerObj.setLastName(results.getString("lastName"));
        	CustomerObj.setPhone(results.getString("phone"));
        	CustomerObj.setEmail(results.getString("email"));
        	CustomerObj.setCountry(results.getString("country"));
        	CustomerObj.setCity(results.getString("city"));
        	CustomerObj.setZipCode(results.getString("zipCode"));
        	CustomerObj.setAddress(results.getString("address"));
        	CustomerObj.setPrevDogs(results.getString("previousDogs"));
        	CustomerObj.setRef(results.getString("ref"));
        	CustomerObj.setEanNumber(results.getString("eanNumber"));
        	CustomerObj.setGardenDescr(results.getString("gardenDescription"));
        	CustomerObj.setKids(results.getString("kids"));
        	CustomerObj.setAnimals(results.getString("animals"));
        	CustomerObj.setAccommodation(results.getString("accommodation"));
              
        }
       catch(Exception e)
       {
           System.out.println("error in building the customer object");
       }
       return CustomerObj;
    }
	
	@Override
	public int updateCustomer(Customer cus)
	{
		Customer cusObj  = cus;
		int rc=-1;

		String query="UPDATE Customer SET "+
		 	  "firstName ='"+ cusObj.getFirstName()+"', "+
		 	  "lastName ='"+ cusObj.getLastName() + "', " +
              "phone ='"+ cusObj.getPhone() + "', " +
		 	  "country ="+ cusObj.getCountry() + "', " +
              "city ='"+ cusObj.getCity() + "' " +
		 	  "zipCode ="+ cusObj.getZipCode() + "', " +
              "address ="+ cusObj.getAddress() + "', " +
		 	  "previousDogs ="+ cusObj.getPrevDogs() + "', " +
              "ref ="+ cusObj.getRef() + "', " +
		 	  "eanNumber ="+ cusObj.getEanNumber() + "', " +
              "gardenDescription ="+ cusObj.getGardenDescr() + "', " +
		 	  "kids ="+ cusObj.getKids() + "', " +
              "animals ="+ cusObj.getAnimals() + "', " +
		 	  "accommodation ="+ cusObj.getAccommodation() + "', ";
	     //     " WHERE ssn = '"+ cusObj.getSsn() + "'";
                System.out.println("Update query:" + query);
  		try{ // update employee
	 		Statement stmt = con.createStatement();
	 		stmt.setQueryTimeout(5);
	 	 	rc = stmt.executeUpdate(query);

	 	 	stmt.close();
		}//slut try
	 	catch(Exception ex){
	 	 	System.out.println("Update exception in employee db: "+ex);
	  	}
		return(rc);
	}
	//@Override
	 public void insertCustomer(Customer cus) throws Exception
	    {  
		 
		 
		   String query="INSERT INTO Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation)  VALUES('"+
				cus.getFirstName()  + "','"  +
				cus.getLastName()  + "','"  +
				cus.getPhone() + "','"  +
				cus.getEmail() + "','"  +
				cus.getCountry() + "','"  +
				cus.getCity() + "','"  +
				cus.getZipCode() + "','"  +
				cus.getAddress() + "','"  +
				cus.getPrevDogs() + "','"  +
				cus.getRef() + "','"  +
				cus.getEanNumber() + "','"  +
				cus.getGardenDescr() + "','"  +
				cus.getKids() + "','"  +
				cus.getAnimals() + "','"  +
				cus.getAccommodation() + "')";
	                     

	       System.out.println("insert : " + query);
	      try{ // insert new employee +  dependent
	          Statement stmt = con.createStatement();
	          stmt.setQueryTimeout(5);
	     	  stmt.executeUpdate(query);
	          stmt.close();
	      }//end try
	       catch(SQLException ex){
	          System.out.println("Employee ikke oprettet");
	          throw new Exception ("Employee is not inserted correct");
	       }
	     }

	 public ArrayList<Customer> findCustom(String phone){
		 ArrayList<Customer> foundCus = new ArrayList<Customer>();
		 return foundCus;
	 }

	@Override
	public ArrayList<Customer> getAllCustomer(ResultSet results)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
/*
	public ArrayList<Customer> getAllbyPhone(String phone) throws SQLException{
		Connection con = dbConnection.getInstance().getDBcon();
		ResultSet results;
		ArrayList<Customer> list = new ArrayList<>();
		try{
			Statement stmt = con.createStatement();
			stmt.setQueryTimeout(5);
			stmt.executeQuery("Select * from Customer where phone = '" + phone + "'");
		
		while(results.next() ){
			Customer CustomerObj = new Customer();
			CustomerObj = buildCustomer(results);
			list.add(CustomerObj);
		}
			stmt.close();
			
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		return list;
		
		
	}*/
}
