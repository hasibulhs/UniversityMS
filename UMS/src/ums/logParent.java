package ums;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class logParent
{
    JFrame f;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    
    public static void main(String[] args)
    {
        logParent obj = new logParent();
        obj.form();
    }
    
    public void form()
    {
        f = new JFrame("Login");
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        f.add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        f.add(l2);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        f.add(t1);

        t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        f.add(t2);
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(600, 300);
        f.setLocation(400, 250);
    }
}
