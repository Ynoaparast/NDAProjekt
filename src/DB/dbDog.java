package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Dog;

public class dbDog {

	private Connection con;
	
	public dbDog(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	
public void insertDog(String name, String age, String gender, String race, String vet, 
		String injuries, String illness, String maturity, String heat, String pseudopregnancy, String castrated, String relatives, String arrival, String previousHomes, int CustomerID) throws Exception
{
	
	
	String query="INSERT INTO Customer(name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes, CustomerID)  VALUES('"+
			name  + "','"  +
			age  + "','"  +
			gender + "','"  +
			race + "','"  +
			vet + "','"  +
			injuries + "','"  +
			illness + "','"  +
			maturity + "','"  +
			heat + "','"  +
			pseudopregnancy + "','"  +
			castrated+ "','"  +
			relatives + "','"  +
			arrival + "','"  +
			previousHomes + "','"+
			CustomerID + "')";
	
	
	System.out.println("insert : " + query);
    
    try{ // insert new employee +  dependent
        Statement stmt = con.createStatement();
        stmt.setQueryTimeout(5);
   	  stmt.executeUpdate(query);
        stmt.close();
    }//end try
     catch(SQLException ex){
        System.out.println("Dog ikke oprettet");
        throw new Exception ("Dog is not inserted correct");
     }
	
}
	
	
	
	
	
}
