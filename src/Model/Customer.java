package Model;

public class Customer {


	private static int ID;

	private static String firstName, lastName, phone, email, country, city, zipCode, address,
	previousDogs, ref, eanNumber, gardenDescription, kids, animals, accommodation;
	
	public Customer(){
		
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Customer.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Customer.lastName = lastName;
	}

	public static String getPhone() {
		return phone;
	}

	public static void setPhone(String phone) {
		Customer.phone = phone;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Customer.email = email;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Customer.country = country;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		Customer.city = city;
	}

	public static String getZipCode() {
		return zipCode;
	}

	public static void setZipCode(String zipCode) {
		Customer.zipCode = zipCode;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Customer.address = address;
	}

	public static String getPreviousDogs() {
		return previousDogs;
	}

	public static void setPreviousDogs(String previousDogs) {
		Customer.previousDogs = previousDogs;
	}

	public static String getRef() {
		return ref;
	}

	public static void setRef(String ref) {
		Customer.ref = ref;
	}

	public static String getEanNumber() {
		return eanNumber;
	}

	public static void setEanNumber(String eanNumber) {
		Customer.eanNumber = eanNumber;
	}

	public static String getGardenDescription() {
		return gardenDescription;
	}

	public static void setGardenDescription(String gardenDescription) {
		Customer.gardenDescription = gardenDescription;
	}

	public static String getKids() {
		return kids;
	}

	public static void setKids(String kids) {
		Customer.kids = kids;
	}

	public static String getAnimals() {
		return animals;
	}

	public static void setAnimals(String animals) {
		Customer.animals = animals;
	}

	public static String getAccommodation() {
		return accommodation;
	}

	public static void setAccommodation(String accommodation) {
		Customer.accommodation = accommodation;
	}


	
}
