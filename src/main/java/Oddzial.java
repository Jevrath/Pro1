
import java.util.*;

public class Oddzial {
	private List<Delivery> deliveryList = new ArrayList<Delivery>();
	Packer packer1 = new Packer();

	public void add_delivery(String type, String adres) {
		Delivery tmp;
		if((tmp = packer1.getDelivery(type, adres)) !=null ) {
			deliveryList.add(tmp);
		}
	}
	public void wypisz() {
		for(int i = 0; i < deliveryList.size(); i++) {
			System.out.println(deliveryList.get(i));
		}
	}
	
}
