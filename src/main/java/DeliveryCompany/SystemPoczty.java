package DeliveryCompany;

import Customer.Odbiorca;

public class SystemPoczty {
	Sortownia sort1 = Sortownia.getSortownia();
	Oddzial oddzial1 = Sortownia.oddzialList.get(0);
	public void wyslij(String typ, Odbiorca odbiorca)
	{
				//oddzial2 = Sortownia.oddzialList.get(1);
		System.out.println("TEST!!!!!!!!!!!!!!");
		oddzial1.addDelivery(typ, odbiorca);
		
	}
	
	public void zakoncz()
	{
		
		oddzial1.sendToSort();
		sort1.sendToOddzialy();
		
		
		
	}
}
