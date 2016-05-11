package DeliveryCompany;

import java.util.Scanner;

import Customer.Odbiorca;

public class SystemPoczty{
	boolean flaga = true;
	
	public class Watek implements Runnable
	{
		public void run()
		{
			while(true)
			{
				if(flaga){
					zakoncz();
					try {
						Thread.sleep(5 * 1000);
						System.out.println("Watek!");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("exce!");

					}
				}
				else
				{
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("exce!");
					}
				}
			}
		}
	}

	public SystemPoczty()
	{
		Runnable runn = new Watek();
		Thread thr = new Thread(runn);
		thr.start();

	}
	
	Sortownia sort1 = Sortownia.getSortownia();
	Oddzial oddzial1 = Sortownia.oddzialList.get(0);
	public void wyslij(/*String typ, Odbiorca odbiorca*/)
	{
		flaga = false;

		String type,name,city;
		System.out.println("Podaj typ paczki[Letter/Paczka]: ");
		type = new Scanner(System.in).nextLine();
		System.out.println("Podaj nazwisko: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Podaj miasto: ");
		city = new Scanner(System.in).nextLine();
		//oddzial.addDelivery(type, new Odbiorca(name,city));
		//system.wyslij(type, new Odbiorca(name,city));
				//oddzial2 = Sortownia.oddzialList.get(1);
		
		oddzial1.addDelivery(type, new Odbiorca(name,city));
		flaga = true;
	}
	

	
	public void zakoncz()
	{
		
		
		
		
		oddzial1.sendToSort();
		sort1.sendToOddzialy();

	}
}
