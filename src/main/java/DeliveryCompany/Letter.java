package DeliveryCompany;
import Customer.Odbiorca;

public class Letter implements Delivery{
	String adres;
	Odbiorca odbior;
	Letter(String adres, Odbiorca name) {
		this.adres = adres;
		odbior = name;
	}
	public String zwrocAdres() {
		return adres;
	}
	public String toString() {
		return "Adres listu: " + adres;
	}
	public String powiadamiaj(String t){ //Zmiana void -> String
		return odbior.update(t);
	}
}
