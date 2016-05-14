package Customer;

public class Odbiorca {
	String name = null;
	String city = null;
	public Odbiorca(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String update(String t) {		
		return "Odbiorca: " + name + " " + t;
	} 
	public String getCity(){
		return city;
	}
}
