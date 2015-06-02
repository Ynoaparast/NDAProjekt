package DB;

import java.sql.Connection;
import java.sql.Statement;

import Model.Dog;

public class dbDog {

	private Connection con;
	
	public dbDog(){
		con = dbConnection.getInstance().getDBcon();
	}
	
public Dog insertDog(Dog d){
	String insertQuery="INSERT INTO Dog(name, age, gender, race, vet, injuries, illness, maturity, heat, psudopregnancy, castrated, relatives, arrival, previousHomes, CustomerID) VALUES('"+
			d.getName() + "','" +
			d.getAge()  + "','" +
			d.getGender() + "','" +
			d.getRace() + "','" +
			d.getVet() + "','" +
			d.getInjuries() + "','"  +
			d.getIllness() + "','"  +
			d.getMaturity() + "','"  +
			d.getHeat() + "','" +
			d.getPsudopregnancy() + "','" +
			d.getCastrated() + "','" +
			d.getRelatives() + "','" +
			d.getArrival() + "','" +
			d.getPreviousHomes() + "','" +
			d.getCustomerID() + "')";
	
	try{
		Statement stmt = con.createStatement();
		stmt.setQueryTimeout(5);
		stmt.executeUpdate(insertQuery);
		stmt.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return d;
	
	
}
	
	
	
	
}
