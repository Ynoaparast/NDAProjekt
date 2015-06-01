package CTRLLayer;
import java.sql.*;

import DBLayer.*;
import ModelLayer.Dog;


public class DogCTRL {
	
	public static void main(String[] args) throws SQLException {
		Dog.createDog(dbConnection.getInstance().getDBcon());
	//	createDog(dbConnection.getInstance().getDBcon());
	}


}
