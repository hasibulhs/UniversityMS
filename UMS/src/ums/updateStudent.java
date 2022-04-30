package ums;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class updateStudent implements ActionListener
{
    JFrame f;
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id15, id20, lab, lab1;
    JTextField t, t1, t2, t3, t4, t5, t6, t7, t12, t13;
    JButton b, b1, b2;
    String id_emp;

    public static void main(String[] args)
    {
        new updateStudent().f.setVisible(true);
    }
    
    updateStudent()
    {
        f = new JFrame("Update Student Details");
        f.setSize(900, 650);
        f.setLocation(250, 50);
        f.setBackground(Color.white);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter roll number to update the data of student");
        l1.setBounds(50, 97, 500, 30);
        l1.setFont(new Font("serif", Font.ITALIC | Font.BOLD, 22));
        f.add(l1);

        t12 = new JTextField();
        t12.setBounds(500, 100, 200, 30);
        f.add(t12);

        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 100, 100, 30);
        f.add(b2);
        b2.addActionListener(this);

        id8 = new JLabel("Update Student Details");
        id8.setBounds(250, 10, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC | Font.BOLD, 40));
        id8.setForeground(Color.black);
        f.add(id8);

        id1 = new JLabel("Name");
        id1.setBounds(50, 170, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 170, 150, 30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 170, 150, 30);
        f.add(t2);

        id3 = new JLabel("Age");
        id3.setBounds(50, 220, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 220, 150, 30);
        f.add(t3);

        id4 = new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400, 220, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 220, 150, 30);
        f.add(t4);

        id5 = new JLabel("Address");
        id5.setBounds(50, 270, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 270, 150, 30);
        f.add(t5);

        id6 = new JLabel("Phone");
        id6.setBounds(400, 270, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 270, 150, 30);
        f.add(t6);

        id7 = new JLabel("Email Id");
        id7.setBounds(50, 320, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 320, 150, 30);
        f.add(t7);

        lab = new JLabel("Course");
        lab.setBounds(400, 320, 150, 30);
        lab.setFont(new Font("serif", Font.BOLD, 20));
        f.add(lab);

        t13 = new JTextField();
        t13.setBounds(600, 320, 150, 30);
        f.add(t13);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250, 450, 150, 40);

        f.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 450, 150, 40);

        f.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b)
        {
            try
            {
                conn con = new conn();
                String str = "update student set name = '" + t1.getText() + "',fathers_name = '" + t2.getText() + "',age = '" + t3.getText() + "', dob = '" + t4.getText() + "',address = '" + t5.getText() + "',phone = '" + t6.getText() + "',email = '" + t7.getText() + "',course = '" + t13.getText() + "' where rollno = '" + t12.getText() + "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Successfully Updated");
                f.setVisible(false);
                new studentDetails().setVisible(true);
            }
            
            catch (Exception e)
            {
                System.out.println("The error is:" + e);
            }
        }
        
        if (ae.getSource() == b1)
        {
            f.setVisible(false);
        }
        
        if (ae.getSource() == b2)
        {
            try
            {
                conn con = new conn();
                String str = "select * from student where rollno = '" + t12.getText() + "'";
                ResultSet rs = con.s.executeQuery(str);

                if (rs.next())
                {
                    f.setVisible(true);

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t13.setText(rs.getString(9));
                }

            }
            
            catch (Exception e)
            {
                
            }

            f.setVisible(true);
            f.setSize(900, 650);
            f.setLocation(250, 50);
        }
    }
}