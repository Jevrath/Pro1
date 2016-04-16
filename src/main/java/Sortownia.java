import java.util.*;

public class Sortownia {
	static Sortownia sort = new Sortownia();
	private List<Delivery> deliveryList = new ArrayList<Delivery>();
	
	private Sortownia() {};
	public void receiveDelivery(List<Delivery> delList) {
		for(Delivery del : delList) {
			deliveryList.add(del);
		}
	}
	public static Sortownia getSortownia(){
		return sort;
	}
	public void wypisz() {
		System.out.println("SORTOWNIA:");
		for(Delivery a: deliveryList) {
			System.out.println(a);
		}
	}
}
