
package emailapp;

import java.util.Scanner;


public class EmailApp {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = input.nextLine();
     Email email = new Email(firstName, lastName);
    System.out.print("Enter your new password: ");
    String password = input.nextLine();
     email.setPasswordChange(password);
     email.showDetails();
     
    }
    
}
