package ModelLayer;

public class Treatment {
	private int ID;
	private String description, book, date;
	
	public int getID(){
		return ID;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getBook(){
		return book;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDescription(String description){
		description = this.description;
	}
	
	public void setBook(String book){
		book = this.book;
	}
	
	public void setDate(String date){
		date = this.date;
	}
}
