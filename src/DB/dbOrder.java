package DB;

import java.sql.Connection;
import java.sql.Statement;

import Model.Order;

public class dbOrder {
	
	
	private Connection con;

	public dbOrder(){
		con = dbConnection.getInstance().getDBcon();
	}	
	
	public Order insertOrder(Order o)throws Exception{
		
		
		String query="INSERT INTO [Order](amount, totalPrice, CustomerID) VALUES('"+
				o.getAmount()  + "','" +
				o.getTotalPrice()  + "'," +
				o.getCustomerID() + ")";
		
		
		try{ // insert new employee + dependent
	        Statement stmt = con.createStatement();
	        stmt.setQueryTimeout(5);
	   	  	stmt.executeUpdate(query);
	        stmt.close();
	    }//end try
	     catch(Exception e){
	        System.out.println("Order ikke oprettet");
	        e.printStackTrace();
	       // throw new Exception ("Dog is not inserted correct");
	     }
		return o;
	}

	

}
