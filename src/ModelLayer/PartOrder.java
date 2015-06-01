package ModelLayer;

public class PartOrder {
	private int ID;
	private String serviceName, type, servicePrice;
	private double hours;
	
	public int getID(){
		return ID;
	}
	
	public String getServiceName(){
		return serviceName;
	}
	
	public String getType(){
		return type;
	}
	
	public String getServicePrice(){
		return servicePrice;
	}
	
	public double getHours(){
		return hours;
	}
	
	public void setServiceName(String serviceName){
		serviceName = this.serviceName;
	}
	
	public void setType(String type){
		type = this.type;
	}
	
	public void setServicePrice(String servicePrice){
		servicePrice = this.servicePrice;
	}
	
	public void setHours(double hours){
		hours = this.hours;
	}
	
	public void addTreatment(){
		
	}
}
