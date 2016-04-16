
public class Klasa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortownia sort1 = Sortownia.getSortownia();
		Oddzial oddzial1 = new Oddzial(), oddzial2 = new Oddzial();
		Klient klient1 = new Klient("Kowalski"), 
				klient2 = new Klient("Nowak");
		klient1.send(oddzial1, "Paczka", "Krakow");
		klient1.send(oddzial1, "Letter", "Warszawa");
		klient2.send(oddzial1,"Liscik","Katowice");
		klient2.send(oddzial1, "Letter", "Krakow");
		klient2.send(oddzial2, "Letter", "Poznan");
		klient1.send(oddzial2, "Paczka", "Wroclaw");
		klient1.send(oddzial2, "badtype", "Krakow");
		oddzial1.sendToMain();
		oddzial2.sendToMain();
		sort1.wypisz();
	}

}
