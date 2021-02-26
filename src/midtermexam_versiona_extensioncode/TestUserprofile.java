/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter your name: ");
        String n = input.nextLine();
        
        System.out.println("Choose your favourite Genre: " );
        System.out.println("Comedy, Drama, Drama, Mystery");  
        String g = input.nextLine();
        
        UserProfile p1 = new UserProfile (n, g);
        
        System.out.println("Your userProfile was created.");
    }
}

