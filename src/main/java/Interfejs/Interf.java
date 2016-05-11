package Interfejs;

import java.util.*;
import DeliveryCompany.Oddzial;
import DeliveryCompany.Sortownia;
import Customer.Odbiorca;
public class Interf {

	/**
	 * @param args
	 */
	void wyslijPaczke(Oddzial oddzial){
		String type,name,city;
		System.out.println("Podaj typ paczki[Letter/Paczka]: ");
		type = new Scanner(System.in).nextLine();
		System.out.println("Podaj nazwisko: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Podaj miasto: ");
		city = new Scanner(System.in).nextLine();
		oddzial.addDelivery(type, new Odbiorca(name,city));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortownia sort1 = Sortownia.getSortownia();
		Oddzial oddzial1 = Sortownia.oddzialList.get(0),
				oddzial2 = Sortownia.oddzialList.get(1);
			
		Scanner odczyt = new Scanner(System.in);
		int wybor = 0;
		boolean cont = true;
		Interf in = new Interf();
		while(cont) {
			System.out.println("Co chcesz zrobic: ");
			System.out.println("1. Wyslij paczke ");
			System.out.println("9. Wyjdz ");
			try{
			wybor = odczyt.nextInt();
			} catch(java.util.InputMismatchException exc) {
				System.out.println("Nie wybrano liczby!!!");
				odczyt.nextLine();
				continue;
			}
			
			switch(wybor){
			case 1:
				System.out.println("Wybrano 1 ");
				in.wyslijPaczke(oddzial1);
				break;
			case 9:
				System.out.println("Wychodze");
				cont = false;
				break;
			default:
				System.out.println("Wybrano zla opcje");
			}
		}
		oddzial1.sendToSort();
		sort1.sendToOddzialy();
	}

}
