package DeliveryCompany;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	

class Komunikat extends Dialog implements ActionListener {
	Button ok;
	Label str;
	String tmp = "";
	
	Komunikat(Frame parent, String tittle, String msg){
		super(parent, tittle ,false);
		this.setLayout(new FlowLayout());
		setSize(300, 200);
		str = new Label(msg);
		ok = new Button("ok");
		
		add(str);
		add(ok);
		
		
		this.setVisible(true);
		ok.addActionListener(this);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	/*
		Komunikat(Frame parent, String tittle, String msg[]){
			super(parent, tittle ,false);
			this.setLayout(new FlowLayout());
			setSize(500, 550);

			ok = new Button("ok");
			
			for(int i=0;i<msg.length;i++)
				tmp += msg[i] + "\n";
			
			TextArea text = new TextArea(tmp, 15, 80);
			add(text);
			add(ok);
			
			this.setVisible(true);
			
			
			ok.addActionListener(this);
			this.setLocationRelativeTo(null);
			
		}
		*/

	public void actionPerformed(ActionEvent a) {
		dispose();
	}
	
	public static void wyswietl(String tmp){
		new Komunikat(null, "Wys³ano", tmp);
	}
	/*
	public static void wyswietl(String tmp[]){
		new Komunikat(null, "Wys³ano", tmp);
	}
	*/
}
