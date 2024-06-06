/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Users { 
    public static ArrayList<PersonClass> users = new ArrayList<>(Arrays.asList(
        new PersonClass("Rei", "Rei A. Example", "Example@email.com", "123", "+63 012-345-6789"),
        new PersonClass("Ced", "Ced R. Ick", "Ick@gmail.com", "345", "+63 987-654-3210")));
    public Users() {
    }

    
}
