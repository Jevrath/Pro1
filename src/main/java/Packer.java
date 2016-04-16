
public class Packer {
	public Delivery getDelivery(String type, String adres) {
		if(type.toLowerCase().equals("letter")) {
			return new Letter(adres);
		}
		if(type.toLowerCase().equals("paczka")) {
			return new Paczka(adres);
		}
		System.out.println("Podano z�y typ paczki");
		return null;
	}
}
