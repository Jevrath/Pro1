
public class Packer {
	public Delivery getDelivery(String type, String adres) {
		if(type == "Letter") {
			return new Letter(adres);
		}
		if(type == "Paczka") {
			return new Paczka(adres);
		}
		System.out.println("Podano z³y typ paczki");
		return null;
	}
}
