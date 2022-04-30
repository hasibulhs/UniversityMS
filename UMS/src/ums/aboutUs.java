package ums;

import java.awt.*;
import javax.swing.*;

public class aboutUs extends JFrame
{
    private JPanel contentPane;

    public static void main(String[] args)
    {
        new aboutUs().setVisible(true);
    }

    public aboutUs()
    {
        super("About Us");
        setBackground(new Color(173, 216, 230));
        setBounds(300, 100, 700, 500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l3 = new JLabel("University Management System");
        l3.setForeground(new Color(30, 144, 255));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 40));
        l3.setBounds(60, 40, 600, 55);
        contentPane.add(l3);

        JLabel l6 = new JLabel("Developed By:");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l6.setBounds(60, 150, 600, 35);
        contentPane.add(l6);
        
        JLabel l7 = new JLabel("Najifa Akter - 18192103012");
        l7.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        l7.setBounds(60, 190, 600, 34);
        contentPane.add(l7);
        
        JLabel l8 = new JLabel("Marjahan Akther - 18192103022");
        l8.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        l8.setBounds(60, 220, 600, 34);
        contentPane.add(l8);
        
        JLabel l9 = new JLabel("Jannatul Mawa - 18192103100");
        l9.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        l9.setBounds(60, 250, 600, 34);
        contentPane.add(l9);
        
        JLabel l10 = new JLabel("Hasibul Hossain Shajeeb - 18192103126");
        l10.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        l10.setBounds(60, 280, 600, 34);
        contentPane.add(l10);

        contentPane.setBackground(Color.WHITE);
    }
}