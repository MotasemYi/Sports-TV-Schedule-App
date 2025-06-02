/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projefsm;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Motasem
 */
public class MakeCon {
    
    public static Connection MakeConnection(){   // databasele connection yapmak icin bu classi yaptim
        
        Connection con = null;

        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo","root" , "Mm1oo1uu1tt1");
        
        if (con != null) {
                System.out.println("Succefuly connection");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    
    return con;
    }
    
    
    
}
