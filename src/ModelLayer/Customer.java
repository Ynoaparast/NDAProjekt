package ModelLayer;

//import DBLayer.dbConnection;

public class Customer {
	
	private int ID;
	private String firstName, lastName, phone, email, country, city, zipCode, address,
	previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation;

	public Customer(){
		
	}
		
	
	public int getID(){
		return ID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public String getCountry(){
		return country; 
	}
	public String getCity(){
		return city; 
	}
	public String getZipCode(){
		return zipCode; 
	}
	public String getAddress(){
		return address; 
	}
	public String getPrevDogs(){
		return previousDogs; 
	}
	public String getRef(){
		return ref;
	}
	public String getEanNumber(){
		return eanNumber;
	}
	public String getGardenDescr(){
		return gardenDescription;
	}
	public String getKids(){
		return kids;
	}
	public String getAnimals(){
		return animals;
	}
	public String getAccommodation(){
		return accommodation;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPrevDogs(String previousDogs){
		this.previousDogs = previousDogs;
	}
	public void setRef(String ref){
		this.ref = ref;
	}
	public void setEanNumber(String eanNumber){
		this.eanNumber = eanNumber;
	}
	public void setGardenDescr(String gardenDescription){
		this.gardenDescription = gardenDescription;
	}
	public void setKids(String kids){
		 this.kids = kids;
	}
	public void setAnimals(String animals){
		 this.animals = animals;
	}
	public void setAccommodation(String accommodation){
		this.accommodation = accommodation;
	}
}
	

//	public static void createCustomer(String firstName, String lastName, String phone, String email, String country, String city, String zipCode, String address, String previousDogs, String ref, String eanNumber, String gardenDescription, String kids, String animals, String accommodation)
//    {
//		Connection con = dbConnection.getInstance().getDBcon();
//        Statement stmt;
 //       try
//        {
//            stmt = con.createStatement();
 //           stmt.executeQuery("INSERT INTO Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation)"
//            		+ "VALUES(" + "'" + firstName +',' + lastName + ',' + phone + ',' + email + ',' + country + ',' + city + ',' + zipCode + ',' + address + ',' + previousDogs + ',' + ref + ',' + eanNumber + ',' + gardenDescription + ',' + kids + ',' + animals + ',' + accommodation + "'" +")");
 //          stmt.close();
//            con.close();
 //       }
 //       catch (Exception e)
 //       {
  //          e.printStackTrace();
 //       }
//	}
	
	
/*	public static Statement updateCustomer(Connection con) throws SQLException{
		Statement stmt;
			stmt = con.createStatement();
			//stmt.executeUpdate("UPDATE Customer(firstName, lastName, phone, email, country, city, zipCode, address, previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation)" + "VALUES('test, 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest', 'hest')");
			stmt.executeUpdate("UPDATE Customer set firstName = 'lort', lastName = 'hestelort' where id = 2");
			stmt.close();
			con.close();
			return stmt;
	}
	
	public static Statement deleteCustomer(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("DELETE Customer where id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
	
	public static Statement findCustomer(Connection con, Customer c) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeQuery("SELECT * FROM Customer WHERE phone ='" + c.getPhone() + "'");
		stmt.close();
		con.close();
		return stmt;
	}
	
	
} */
