package Interfejs;

import java.util.*;
import DeliveryCompany.Oddzial;
import DeliveryCompany.Sortownia;
import DeliveryCompany.SystemPoczty;
import Customer.Odbiorca;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Interf extends Applet
implements ItemListener, ActionListener{
	SystemPoczty syst = new SystemPoczty();
	
	/**
	 * @param args
	 */
	String msg = "Co chcesz wys³aæ?";
	Choice item, city;
	Button ok;
	TextField name;
	Label name1;
	
	public void init(){
		this.setSize(800, 300);
		
		//Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    //int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
	    //int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
	    //this.setLocation(60,30);
	   
	    
		item = new Choice();
		city = new Choice();
		ok = new Button("wyœlij");
		name1 = new Label("Nazwisko odbiorcy:", Label.RIGHT);
		name = new TextField(20);
		
		
		item.add("paczka");
		item.add("list");

		city.add("Kraków");
		city.add("Myœlenice");
		city.add("Wieliczka");
		city.add("Warszawa");
		city.add("Radom");
		city.add("Legionowo");
		city.add("Poznañ");
		city.add("Gniezno");
		city.add("Grodzisk wielkopolski");
		city.add("Rzeszów");
		city.add("Przemyœl");
		city.add("Krosno");
		city.add("Gdañsk");
		city.add("Sopot");
		city.add("Gdynia");
		city.add("Olsztyn");
		city.add("Mr¹gowo");
		city.add("Suwa³ki");
		city.add("Wroc³aw");
		city.add("Legnica");
		city.add("Wa³brzych");
		city.add("Katowice");
		city.add("Sosnowiec");
		city.add("Gliwice");
		
			
		
		add(name1);
		add(name);
		add(item);
		add(city);
		add(ok);
		
		
		
		
		name.addActionListener(this);
		item.addItemListener(this);
		city.addItemListener(this);
		ok.addActionListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent list) {
		
	}
	
	public void actionPerformed(ActionEvent button) {
		// TODO Auto-generated method stub
		String str = button.getActionCommand();
		if(str.equals("wyœlij") && !name.getText().equals(""))
		{
			syst.wyslij(item.getSelectedItem(), name.getText(), city.getSelectedItem());
			syst.zakoncz();
		}
		
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 350, 50);
	}



	
/*	
	public static void main(String[] args) {
		
		SystemPoczty syst = new SystemPoczty();

			
		Scanner odczyt = new Scanner(System.in);
		int wybor = 0;
		boolean cont = true;
		//Interf in = new Interf();
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
				syst.wyslij();
				break;
			case 9:
				System.out.println("Wychodze");
				cont = false;
				break;
			default:
				System.out.println("Wybrano zla opcje");
			}
		}
		//oddzial1.sendToSort();
		//sort1.sendToOddzialy();
		//in.system.zakoncz();
	}
*/


}
