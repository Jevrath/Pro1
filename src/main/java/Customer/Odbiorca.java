package Customer;

public class Odbiorca {
	String name = null;
	String city = null;
	public Odbiorca(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public void update(String t) {
		System.out.println("Odbiorca: " + name + " " + t);
	}
	public String getCity(){
		return city;
	}
}
