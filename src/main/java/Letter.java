
public class Letter implements Delivery{
	String adres;
	Letter(String adres) {
		this.adres = adres;
	}
	public String zwrocAdres() {
		return adres;
	}
	public String toString() {
		return "Adres listu: " + adres;
	}
}
