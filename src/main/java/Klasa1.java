
public class Klasa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oddzial oddzial1 = new Oddzial();
		Klient klient1 = new Klient("Kowalski"), 
				klient2 = new Klient("Nowak");
		klient1.send(oddzial1, "Paczka", "Krakow");
		klient1.send(oddzial1, "Letter", "Warszawa");
		klient2.send(oddzial1,"Liscik","Katowice");
		klient2.send(oddzial1, "Letter", "Krakow");
		oddzial1.wypisz();
	}

}
