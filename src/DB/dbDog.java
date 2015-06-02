package DB;

import java.sql.Connection;
import java.sql.Statement;

public class dbDog {

	private Connection con;
	
	public dbDog(){
		con = dbConnection.getInstance().getDBcon();
	}
	
	
public void insertDog(String name, String age, String gender, String race, String vet, String injuries, String illness,
		String maturity, String heat, String psudopregnancy, String castrated, String relatives, String arrival, String previousHomes, int CustomerID) throws Exception
{
		
	String query="INSERT INTO Dog(name, age, gender, race, vet, injuries, illness, maturity, heat, psudopregnancy, castrated, relatives, arrival, previousHomes, CustomerID) VALUES('"+
			name  + "','" +
			age  + "','" +
			gender + "','" +
			race + "','" +
			vet + "','" +
			injuries + "','"  +
			illness + "','"  +
			maturity + "','"  +
			heat + "','" +
			psudopregnancy + "','" +
			castrated+ "','" +
			relatives + "','" +
			arrival + "','" +
			previousHomes + "','"+
			CustomerID + "')";
	
	
	System.out.println("insert : " + query);
    
    try{ // insert new employee + dependent
        Statement stmt = con.createStatement();
        stmt.setQueryTimeout(5);
   	  	stmt.executeUpdate(query);
        stmt.close();
    }//end try
     catch(Exception e){
        System.out.println("Dog ikke oprettet");
        e.printStackTrace();
       // throw new Exception ("Dog is not inserted correct");
     }
	
}
	
	
	
	
	
}
