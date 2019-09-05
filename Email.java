package emailapp;

import java.util.Random;
import java.util.Scanner;


public class Email { 
    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;
    private String password;
    private final int defaultPasswordLength = 10;
    private int mailCount = 100;

    
    //Constructor for first name and last name 
    public Email (String firstName, String lastName) {
    this.firstName = firstName; 
    this.lastName = lastName;
  //  System.out.println("Email Created: " +firstName + "." +lastName);
    //Calling the department method
    this.department = setDepartment();
  //  System.out.println("Department: " +this.department);
    //Calling the password method
    this.password = randomPassword(defaultPasswordLength);
   // System.out.println("Your password: " +this.password);
    showDetails();
    }
    
    //Create method that asks for Department
    private String setDepartment(){
       System.out.print(firstName + "Enter your department code: \n1 for Accounting \n2 for IT"
               + "\n3 for Operations\n4 for HR\n0 for none\nEnter your department: ");
       Scanner sc = new Scanner(System.in);
       int dept = sc.nextInt();
       switch(dept){
           case 1: return "acct"; case 2: return "it"; case 3:return "operations"; 
           default: return "";
       }
        
    } 
    
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@%/.,&*_-";
        char [] password = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++){
            int rand = random.nextInt(passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        
        return new String(password);
         } 
    public void setMailCount (int capacity) {
        this.mailCount = capacity;
    }
    
    public void setPasswordChange(String password){
        this.password = password;
    }
    
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }
    public int getMailCount(){
        return mailCount;
    }
    public String getPasswordChange(){
        return  password;
    }
    public String getAlternateEmail(){
        return alternateEmail;
     }
    
    public void showDetails(){
        System.out.println("\nEmail: "+this.firstName +"." + this.lastName + "@"+this.department+ ".aeycompany.com\n"+
                "Password: "+this.password + "\n"+
                "Mail Capacity: " +this.mailCount +"MB\n");
    }
    }
