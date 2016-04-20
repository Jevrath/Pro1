
import java.util.*;

public class Oddzial {
	private List<Delivery> sortowniaList = new ArrayList<Delivery>();  // lista do wyslania do sortowni
	private List<Delivery> odbiorcyList = new ArrayList<Delivery>(); // lista przesylek dla odbiorcow
	Miasto city;
	Packer packer1 = new Packer();

	public Oddzial(Miasto city) {
		this.city = city;
	}
	
	public void addDelivery(String type, String adres, Klient name) {
		Delivery tmp;
		if((tmp = packer1.getDelivery(type, adres, name)) !=null ) {
			sortowniaList.add(tmp);
		}
	}
	public void sendToSort() {
		Sortownia.getSortownia().receiveDelivery(sortowniaList);
		sortowniaList.clear();
	}
	public void receiveFromSort(List<Delivery> delList) {
		for(Delivery d: delList) {
			odbiorcyList.add(d);
		}
		wypisz();
	}
	public void wypisz() {
		System.out.println("ODDZIAL "+ city.adrMain);
		for(Delivery a: odbiorcyList) {
			System.out.println(a);
		}
	}
	
}
