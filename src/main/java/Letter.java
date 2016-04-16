
public class Letter implements Delivery{
	String adres;
	Letter(String adres) {
		this.adres = adres;
	}
	public String zwrocAdres() {
		return null;
	}
	public String toString() {
		return "Adres listu: " + adres;
	}
}
