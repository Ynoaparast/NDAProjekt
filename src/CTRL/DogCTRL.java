package CTRL;

import DB.dbDog;

public class DogCTRL {

	public void CreateDog(String name, String age, String gender, String race, String vet, String injuries, String illness, 
			String maturity, String heat, String psudopregnancy, String castrated, String relatives, String arrival, String previousHomes, int CustomerID)throws Exception{
		
		dbDog dbD = new dbDog();
		dbD.insertDog(name, age, gender, race, vet, injuries, illness, maturity, heat, psudopregnancy, castrated, relatives, arrival, previousHomes, CustomerID);
	}
	
}
