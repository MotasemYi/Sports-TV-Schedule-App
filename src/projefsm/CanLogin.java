/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projefsm;

/**
 *
 * @author Motasem
 */
public class CanLogin {   // Super class 
    
    // sub class  Admin class
    
    protected String Name;
    protected String Password;
    protected int Age;
    protected String Email;
    protected String Phone;
    protected String FavoriTeam;
    protected String Gender;
    

    public CanLogin(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }

    public CanLogin() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CanLogin(String Name, String Password, int Age, String Email, String Phone, String FavoriTeam, String Gender) {
        this.Name = Name;
        this.Password = Password;
        this.Age = Age;
        this.Email = Email;
        this.Phone = Phone;
        this.FavoriTeam = FavoriTeam;
        this.Gender = Gender;
    }

    

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getFavoriTeam() {
        return FavoriTeam;
    }

    public void setFavoriTeam(String FavoriTeam) {
        this.FavoriTeam = FavoriTeam;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
    
    
    
    
    
    
    
}
