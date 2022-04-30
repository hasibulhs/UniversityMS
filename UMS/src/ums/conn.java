package ums;
import java.sql.*;

public class conn
{
    Connection c; //Connection interface
    Statement s; //Statement interface
    
    public conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ums","root","");    
            s = c.createStatement();
        }
        
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}