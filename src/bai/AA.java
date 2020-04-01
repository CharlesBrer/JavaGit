package bai;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AA extends Applet implements ActionListener{
    Label p1,p2;
    TextField t1,t2;
    Button b;
    Student s;
    String a = "Welcome";
    public void init(){
        p1 = new Label("Name");
        p2 = new Label("Number");
        t1 = new TextField(10);
        t2 = new TextField(10);
        b = new Button("    OK     ");
        b.addActionListener(this);
        add(p1);  add(t1); add(p2);add(t2); add(b);
        s = new Student();
        
    }
    

    public void paint(Graphics g)
    {
        g.drawString(a,200,200);
    }

    public void actionPerformed(ActionEvent e)
    {
        s.name = t1.getText();
        try{
        s.id = Integer.parseInt(t2.getText());
        if(s.id<1 || s.id>57){
        		throw new NumberFormatException();
        }
        a = s.toString();
        }
        catch(NumberFormatException ex){
        	a = "学号必须是0与57之间的整数";
        }
        repaint();
    }
}

class Student{
    String name;
    int id=0;
    public String toString()
    {
        return "姓名:"+name+"   学号："+id;
    }
}