
public class Packer {
	public Delivery getDelivery(String type, String adres, Klient name) {
		if(type.toLowerCase().equals("letter")) {
			return new Letter(adres, name);
		}
		if(type.toLowerCase().equals("paczka")) {
			return new Paczka(adres, name);
		}
		System.out.println("Podano z�y typ paczki");
		return null;
	}
}
