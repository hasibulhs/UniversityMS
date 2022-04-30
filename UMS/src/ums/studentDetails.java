package ums;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class studentDetails extends JFrame implements ActionListener
{
    JLabel l1;
    JTable t1;
    JButton b1, b3;
    JTextField t2;
    String x[] = {"Name", "Father's Name", "Age", "Date of Birth", "Address", "Phone", "Email", "Roll No", "Course"};
    String y[][] = new String[20][13];
    int i = 0, j = 0;

    public static void main(String[] args)
    {
        new studentDetails().setVisible(true);
    }
    
    studentDetails()
    {
        super("Student Details");
        
        setSize(1260, 650);
        setLocation(50, 50);
        setLayout(null);

        l1 = new JLabel("Enter the roll number to delete student : ");
        l1.setBounds(50, 400, 400, 30);
        l1.setFont(new Font("serif", Font.BOLD, 20));
        add(l1);

        t2 = new JTextField();
        t2.setBounds(400, 400, 200, 30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 400, 100, 30);
        add(b1);

        b3 = new JButton("Update Student");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(730, 400, 150, 30);
        add(b3);

        b1.addActionListener(this);
        b3.addActionListener(this);

        try
        {
            conn c1 = new conn();
            String s1 = "select * from student";
            ResultSet rs = c1.s.executeQuery(s1);
            
            while (rs.next())
            {
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("fathers_name");
                y[i][j++] = rs.getString("age");
                y[i][j++] = rs.getString("dob");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("rollno");
                y[i][j++] = rs.getString("course");
                i++;
                j = 0;
            }
            
            t1 = new JTable(y, x);
        }
        
        catch (Exception e)
        {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20, 20, 1200, 330);
        add(sp);

        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        conn c1 = new conn();

        if (ae.getSource() == b1)
        {
            try
            {
                String a = t2.getText();
                String q = "delete from student where rollno = '" + a + "'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new studentDetails().setVisible(true);
            }
            
            catch (Exception e)
            {
                
            }

        } 
        
        else if (ae.getSource() == b3)
        {
            this.setVisible(false);
            new updateStudent().f.setVisible(true);
        }
    }
}