package Model;

public class Dog {
	
	private static int ID;
	private static String name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes;
	private static int CustomerID;
	
	public Dog(){
		
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Dog.name = name;
	}

	public static String getAge() {
		return age;
	}

	public static void setAge(String age) {
		Dog.age = age;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Dog.gender = gender;
	}

	public static String getRace() {
		return race;
	}

	public static void setRace(String race) {
		Dog.race = race;
	}

	public static String getVet() {
		return vet;
	}

	public static void setVet(String vet) {
		Dog.vet = vet;
	}

	public static String getInjuries() {
		return injuries;
	}

	public static void setInjuries(String injuries) {
		Dog.injuries = injuries;
	}

	public static String getIllness() {
		return illness;
	}

	public static void setIllness(String illness) {
		Dog.illness = illness;
	}

	public static String getMaturity() {
		return maturity;
	}

	public static void setMaturity(String maturity) {
		Dog.maturity = maturity;
	}

	public static String getHeat() {
		return heat;
	}

	public static void setHeat(String heat) {
		Dog.heat = heat;
	}

	public static String getPseudopregnancy() {
		return pseudopregnancy;
	}

	public static void setPseudopregnancy(String pseudopregnancy) {
		Dog.pseudopregnancy = pseudopregnancy;
	}

	public static String getCastrated() {
		return castrated;
	}

	public static void setCastrated(String castrated) {
		Dog.castrated = castrated;
	}

	public static String getRelatives() {
		return relatives;
	}

	public static void setRelatives(String relatives) {
		Dog.relatives = relatives;
	}

	public static String getArrival() {
		return arrival;
	}

	public static void setArrival(String arrival) {
		Dog.arrival = arrival;
	}

	public static String getPreviousHomes() {
		return previousHomes;
	}

	public static void setPreviousHomes(String previousHomes) {
		Dog.previousHomes = previousHomes;
	}

	public static int getCustomerID() {
		return CustomerID;
	}

	public static void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
	

}
