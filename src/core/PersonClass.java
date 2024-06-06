/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author USER
 */
public class PersonClass {
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    
    public PersonClass(String username, String name, String email, String password, String phoneNumber) {
        this.username = username;
        this.fullName = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public PersonClass(String text, String trim, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
        public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return this.phoneNumber;
    }

    public void setNumber(String number) {
        this.phoneNumber = number;
    }

    public String getPassword() {
        return this.password;
    }

    
}
