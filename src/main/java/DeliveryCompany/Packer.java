package DeliveryCompany;
import Customer.Odbiorca;

public class Packer {
	public Delivery getDelivery(String type, String adres, Odbiorca name) {
		if(type.toLowerCase().equals("letter")) {
			return new Letter(adres, name);
		}
		if(type.toLowerCase().equals("paczka")) {
			return new Paczka(adres, name);
		}
		System.out.println("Podano z³y typ paczki");
		return null;
	}
}
