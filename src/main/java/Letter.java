
public class Letter implements Delivery{
	String adres;
	Klient odbiorca;
	Letter(String adres, Klient name) {
		this.adres = adres;
		odbiorca = name;
	}
	public String zwrocAdres() {
		return adres;
	}
	public String toString() {
		return "Adres listu: " + adres;
	}
	public 	void powiadamiaj(String t){
		odbiorca.update(t);
	}
}
