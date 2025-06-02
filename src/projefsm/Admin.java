/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projefsm;
                            //Admin sinif CanLogin sinifindan inhertiance alan bir sinifdir  
import java.util.ArrayList; // Bu classin icinde Adminlerin bilgileri bir private arrayliste tutcagiz

/**
 *
 * @author Motasem
 */
public class Admin extends CanLogin{
    
    private static ArrayList<Admin> Admins = new ArrayList<>(); // adminlerin bilgileri tutan Arraylist

   

    public static ArrayList<Admin> getAdmins() {
        return Admins;
    }

    public static void setAdmins(ArrayList<Admin> Admins) {
        Admin.Admins = Admins;
    }

    public Admin() {
    }
    
    

    public Admin(String AdminName, String Password) {  
        this.Name = AdminName;
        this.Password = Password;
    }
    
    public void addAdmin(String Admin_name, String Password132){ // Bu metotu yeni bir admin hesapi yapmak icin olusturdum
        Admin newAdmin = new Admin(Admin_name,Password132 ); // parametre olarak bir isim ve password alip yeni bir Admin sinif objesi olusturyor
        
        Admins.add(newAdmin); // olusturdugumuz yeni obj Admins arrayliste tutcagiz
        
        
    }
    
   
    
    
    
    
    
}
