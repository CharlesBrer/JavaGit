package bai;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AA1 extends Applet implements ActionListener{
	Label p1,p2;
	TextField t1,t2;
	Button b;
	Student s;
	String m;
	public void init(){
		p1 = new Label("name");
		p2 = new Label("string");
		t1 = new TextField(10);
		t2 = new TextField(10);
		b = new Button("  OK  ");
		add(p1); add(t1); add(p2); add(t2); add(b);
	}
	public void paint(Graphics g){
		g.drawString(m, 12, 100);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		s.name = t1.getText();
		s.id = Integer.parseInt(t1.getText());
	}
}
