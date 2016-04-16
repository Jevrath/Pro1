
import java.util.*;

public class Oddzial {
	private List<Delivery> deliveryList = new ArrayList<Delivery>();
	Packer packer1 = new Packer();

	public void addDelivery(String type, String adres) {
		Delivery tmp;
		if((tmp = packer1.getDelivery(type, adres)) !=null ) {
			deliveryList.add(tmp);
		}
	}
	public void sendToMain() {
		Sortownia.getSortownia().receiveDelivery(deliveryList);
		deliveryList.clear();
	}
	
	
}
