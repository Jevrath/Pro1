package DeliveryCompany;
import Customer.Odbiorca;

public class Paczka implements Delivery {

	String adres;
	Odbiorca odbior;
	Paczka(String adres,Odbiorca name) {
		this.adres = adres;
		odbior = name;
	}
	public String zwrocAdres() {
		// TODO Auto-generated method stub
		return adres;
	}
	public String toString() {
		return "Adres paczki: " + adres;
	}

public class Paczka implements Delivery {

	String adres;
	Klient odbiorca;
	Paczka(String adres, Klient name) {
		this.adres = adres;
		odbiorca = name;
	}
	public String zwrocAdres() {
		// TODO Auto-generated method stub
		return adres;
	}
	public String toString() {
		return "Adres paczki: " + adres;
	}
	public 	void powiadamiaj(String t){
		odbior.update(t);
	}
}
	public 	void powiadamiaj(String t){
		odbiorca.update(t);
	}
}
