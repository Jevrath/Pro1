package DeliveryCompany;



import java.util.*;


public class Sortownia{
	static Sortownia sort = new Sortownia();
	private List<Delivery> deliveryList = new ArrayList<Delivery>();
	private List<Delivery> toSend = new ArrayList<Delivery>();
	public static List<Oddzial> oddzialList = new ArrayList<Oddzial>();
	static {
		oddzialList.add(new Oddzial(new Miasto("kraków", "myœlenice", "wieliczka")));
		oddzialList.add(new Oddzial(new Miasto("warszawa","radom","legionowo")));
	}
	private Sortownia() {
	};
	public void receiveDelivery(List<Delivery> delList) { 
		for(Delivery del : delList) {
			deliveryList.add(del);
			Komunikat.wyswietl(del.powiadamiaj(del.getClass().getSimpleName() + " w sortowni"));
			/*
			String tmp[] = new String[5];
			tmp[0] = "1 linia";
			tmp[1] = "2 linia";
			tmp[2] = "3 linia";
			tmp[3] = "4 linia";
			tmp[4] = "5 linia";
			Komunikat.wyswietl(tmp);
			*/
		}
		
	}
	public static Sortownia getSortownia(){
		return sort;
	}
	public void sendToOddzialy() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c"));
		ListIterator<String> it = a.listIterator();
		

		
		for(Oddzial od: oddzialList) {
			
			for(int i = 0; i < deliveryList.size(); i++) {
				if(od.city.contain(deliveryList.get(i).zwrocAdres())){
					toSend.add(deliveryList.get(i));
					deliveryList.remove(i);
					i--;
				}
				
			}
			if(toSend.size()>0) {
				od.receiveFromSort(toSend);
				toSend.clear();
			}
		}
	}
	
	public void wypisz() {
		System.out.println("SORTOWNIA:");
		for(Delivery a: deliveryList) {
			System.out.println(a);
		}
	}
}