import java.util.*;
public class Klasa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortownia sort1 = Sortownia.getSortownia();
		
		Oddzial oddzial1 = Sortownia.oddzialList.get(0),
				oddzial2 = Sortownia.oddzialList.get(1);
		Klient klient1 = new Klient("Kowalski"), 
				klient2 = new Klient("Nowak");
		klient1.send(oddzial1, "Paczka", "Krakow");
		klient1.send(oddzial1, "Letter", "Warszawa");
		klient2.send(oddzial1,"Liscik","Wieliczka");
		klient2.send(oddzial1, "Letter", "Krakow");
		klient2.send(oddzial2, "Letter", "Poznan");
		klient1.send(oddzial2, "Paczka", "Wroclaw");
		klient1.send(oddzial2, "badtype", "Krakow");
		klient1.send(oddzial2,  "paczka", "radom");
		oddzial1.sendToSort();
		oddzial2.sendToSort();
		sort1.wypisz();
		sort1.sendToOddzialy();
	}

}
