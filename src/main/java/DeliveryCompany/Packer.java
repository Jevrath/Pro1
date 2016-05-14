package DeliveryCompany;
import Customer.Odbiorca;

public class Packer {
	public Delivery getDelivery(String type, String adres, Odbiorca name) {
		if(type.toLowerCase().equals("list")) {
			return new Letter(adres, name);
		}
		if(type.toLowerCase().equals("paczka")) {
			return new Paczka(adres, name);
		}
		System.out.println("Podano z�y typ paczki");
		return null;
	}
}
