package Customer;
import java.util.*;

import DeliveryCompany.Oddzial;



public class Klient {
	String name = null;
	public Klient(String name) {
		this.name = name;
	}/*
	public void send(Oddzial od,String type,String adres) {
		od.addDelivery(type, adres,this);
	}*/
	public void update(String t) {
		System.out.println("Klient: " + name + " " + t);
	}
}
