/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketbookingmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MarcoMan
 * PLEASE SUBSCRIBE OUR CHANNEL FOR SUPPORT AND HIT THE LIKE BUTTON THANKS : ) 
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
                                
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/traindata", "root", ""); 
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
