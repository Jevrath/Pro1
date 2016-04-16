//import java.util.*;



public class Klient {
	String name = null;
	public Klient(String name) {
		this.name = name;
	}
	public void send(Oddzial od,String type,String adres) {
		od.add_delivery(type, adres);
	}
}
