package ModelLayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Dog {
	private int ID;
	private String name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes;
	
	public int getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAge(){
		return age;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getRace(){
		return race;
	}
	
	public String getVet(){
		return vet;
	}
	
	public String getInjuries(){
		return injuries;
	}
	
	public String getIllness(){
		return illness;
	}
	
	public String getMaturity(){
		return maturity;
	}
	
	public String getHeat(){
		return heat;
	}
	
	public String getPseudopregnancy(){
		return pseudopregnancy;
	}
	
	public String getCastrated(){
		return castrated;
	}
	
	public String getRelatives(){
		return relatives;
	}
	
	public String getArrival(){
		return arrival;
	}
	
	public String getPreviousHomes(){
		return previousHomes;
	}

	public void setName(String name){
		name = this.name;
	}
	
	public void setAge(String age){
		age = this.age;
	}
	
	public void setGender(String gender){
		gender = this.gender;
	}
	
	public void setRace(String race){
		race = this.race;
	}
	
	public void setVet(String vet){
		vet = this.vet;
	}
	
	public void setInjuries(String injuries){
		injuries = this.injuries;
	}
	
	public void setIllness(String illness){
		illness = this.illness;
	}
	
	public void setMaturity(String maturity){
		maturity = this.maturity;
	}
	
	public void setHeat(String heat){
		heat = this.heat;
	}
	
	public void setPseudopregnancy(String pseudopregnancy){
		pseudopregnancy = this.pseudopregnancy;
	}
	
	public void setCastrated(String castrated){
		castrated = this.castrated;
	}
	
	public void setRelatives(String relatives){
		relatives = this.relatives;
	}
	
	public void setArrival(String arrival){
		arrival = this.arrival;
	}
	
	public void setPreviousHomes(String previousHomes){
		previousHomes = this.previousHomes;
	}
	
	public static void createDog(Connection con){
		Statement stmt;
		try{
			stmt = con.createStatement();
			stmt.executeQuery("INSERT INTO Dog(name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes)" 
					+ "VALUES('hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund', 'hund')");
			stmt.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Statement updateDog(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("UPDATE Dog set name = 'Hundelort', age = '11' where id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
	
	public static Statement deleteCustomer(Connection con) throws SQLException{
		Statement stmt;
		stmt = con.createStatement();
		stmt.executeUpdate("DELETE Dog where id = 1");
		stmt.close();
		con.close();
		return stmt;
	}
}
