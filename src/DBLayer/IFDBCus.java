package DBLayer;
import ModelLayer.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IFDBCus {
	//public ArrayList<Customer> getAllCustomer(boolean retrieveAssociation);
//	public int insertCustomer(Customer cus) throws Exception;
	public int updateCustomer(Customer cus);
	public ArrayList<Customer> getAllCustomer(ResultSet results) throws SQLException;
	

}
