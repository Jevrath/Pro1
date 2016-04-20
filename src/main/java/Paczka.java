
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
		odbiorca.update(t);
	}
}
