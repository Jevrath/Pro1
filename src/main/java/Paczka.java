
public class Paczka implements Delivery {

	String adres;
	
	Paczka(String adres) {
		this.adres = adres;
	}
	public String zwrocAdres() {
		// TODO Auto-generated method stub
		return adres;
	}
	public String toString() {
		return "Adres paczki: " + adres;
	}
	
}
