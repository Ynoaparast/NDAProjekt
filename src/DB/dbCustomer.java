package DB;

import java.beans.Expression;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Customer;

public class dbCustomer {
	private Connection con;
	public dbCustomer(){
		con = dbConnection.getInstance().getDBcon();
	}
	public void getAllCustomers() throws SQLException{
		
		try{
			String query="Select * from Customer";
			Connection con = dbConnection.getInstance().getDBcon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Customer> arrayCus = new ArrayList<Customer>();
			
			while(rs.next()){
				Customer cusObj = new Customer();
				cusObj.setFirstName(rs.getString("firstName"));
				cusObj.setLastName(rs.getString("lastName"));
				arrayCus.add(cusObj);
			}
			con.close();
			stmt.close();
			for(int i = 0; i < arrayCus.size(); i++){
				System.out.println(arrayCus.get(i).getFirstName());	
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//return getCustomer();
	}
	
	
	public Customer getByPhone(String phone){
		try{
			String query = "Select top 1 * from customer where phone ='"+ phone + "'order by ID desc";
			Connection con = dbConnection.getInstance().getDBcon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Customer> cusByPhone = new ArrayList<Customer>();
			while(rs.next()){
				Customer cusObj = new Customer();
				cusObj.setFirstName(rs.getString("firstName"));
				cusObj.setLastName(rs.getString("lastName"));
				cusObj.setAddress(rs.getString("address"));
				cusObj.setPhone(rs.getString("phone"));
				cusByPhone.add(cusObj);
			}
			con.close();
			stmt.close();
			for(int i = 0; i < cusByPhone.size(); i++){
				System.out.println(cusByPhone.get(i).getFirstName());	
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cusObj;
	}
	
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
				cus.getPreviousDogs() + "','"  +
				cus.getRef() + "','"  +
				cus.getEanNumber() + "','"  +
				cus.getGardenDescription() + "','"  +
				cus.getKids() + "','"  +
				cus.getAnimals() + "','"+
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

	
}
