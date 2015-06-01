package CTRLLayer;
import java.sql.*;

import ModelLayer.*;
import DBLayer.*;

public class OrderCTRL {
	public static void main(String[] args) throws SQLException {
		Order.createOrder(dbConnection.getInstance().getDBcon());
		//createOrder(dbConnection.getInstance().getDBcon());
	}
	
}
