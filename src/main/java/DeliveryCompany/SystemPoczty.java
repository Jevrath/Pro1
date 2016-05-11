package DeliveryCompany;

import Customer.Odbiorca;

public class SystemPoczty {
	
	public void wyslij(String typ, Odbiorca odbiorca)
	{
		Sortownia sort1 = Sortownia.getSortownia();
		Oddzial oddzial1 = Sortownia.oddzialList.get(0);
				//oddzial2 = Sortownia.oddzialList.get(1);
		
		oddzial1.addDelivery(typ, odbiorca);
		
	}
	
	public void zakoncz()
	{
		Sortownia sort1 = Sortownia.getSortownia();
		Oddzial oddzial1 = Sortownia.oddzialList.get(0);
		oddzial1.sendToSort();
		sort1.sendToOddzialy();
		
		
		
	}
}
