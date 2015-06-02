package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Customer;

public class dbCustomer {
	
	private Connection con;
	
	public dbCustomer(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	public Customer getByPhone(String phone){
		
		Customer cusObj = new Customer();
		try{
			String query = "Select top 1 * from customer where phone ='"+ phone + "'order by ID desc";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			rs.next();
			
			cusObj.setID(rs.getInt("ID"));
			cusObj.setFirstName(rs.getString("firstName"));
			cusObj.setLastName(rs.getString("lastName"));
			cusObj.setPhone(rs.getString("phone"));
			cusObj.setEmail(rs.getString("email"));
			cusObj.setCountry(rs.getString("country"));
			cusObj.setCity(rs.getString("city"));
			cusObj.setZipCode(rs.getString("zipCode"));		
			cusObj.setAddress(rs.getString("address"));
			cusObj.setPreviousDogs(rs.getString("previousDogs"));
			cusObj.setRef(rs.getString("ref"));
			cusObj.setEanNumber(rs.getString("eanNumber"));			
			cusObj.setGardenDescription(rs.getString("gardenDescription"));
			cusObj.setKids(rs.getString("kids"));
			cusObj.setAnimals(rs.getString("animals"));
			cusObj.setAccommodation(rs.getString("accommodation"));
			
			con.close();
			stmt.close();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cusObj;
	}
	
	public void insertCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, 
			String previousDogs, String ref, String eanNumber, String gardenDescription, String kids, String animals, String accommodation) throws Exception
	 {
		   
		
		String query="INSERT INTO Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation)  VALUES('"+
				firstName  + "','"  +
				lastName  + "','"  +
				phone + "','"  +
				email + "','"  +
				country + "','"  +
				city + "','"  +
				zipCode + "','"  +
				address + "','"  +
				previousDogs + "','"  +
				ref + "','"  +
				eanNumber+ "','"  +
				gardenDescription + "','"  +
				kids + "','"  +
				animals + "','"+
				accommodation + "')";
	            
	
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

	
}
