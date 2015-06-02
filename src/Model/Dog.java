package Model;

public class Dog {
	
	private int ID;
	private String name, age, gender, race, vet, injuries, illness, maturity, heat, psudopregnancy, castrated, relatives, arrival, previousHomes;
	private int CustomerID;
	
	public Dog(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getVet() {
		return vet;
	}

	public void setVet(String vet) {
		this.vet = vet;
	}

	public String getInjuries() {
		return injuries;
	}

	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getMaturity() {
		return maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public String getHeat() {
		return heat;
	}

	public void setHeat(String heat) {
		this.heat = heat;
	}

	public String getPseudopregnancy() {
		return psudopregnancy;
	}

	public void setPseudopregnancy(String psudopregnancy) {
		this.psudopregnancy = psudopregnancy;
	}

	public String getCastrated() {
		return castrated;
	}

	public void setCastrated(String castrated) {
		this.castrated = castrated;
	}

	public String getRelatives() {
		return relatives;
	}

	public void setRelatives(String relatives) {
		this.relatives = relatives;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getPreviousHomes() {
		return previousHomes;
	}

	public void setPreviousHomes(String previousHomes) {
		this.previousHomes = previousHomes;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	
	

}
