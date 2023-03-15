package day15_whileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");
        String uName=input.next();
        System.out.println("Enter your password");
        String passW=input.next();
        if (uName.equals("Cydeo")&& passW.equals("Cydeo123")){              // if the credentials are correct
            System.out.println("Logged in");}
        else {                                                              //otherwise
            for (int i = 1; i <=3 ; i++) {                                  //i: 0, 1, 2
            System.err.println("Invalid credentials Enter your username");
            uName=input.next();
            System.out.println("Enter your password");
            passW=input.next();
            if (uName.equals("Cydeo")&& passW.equals("Cydeo123")){          //if the user enters valid credentials
                System.out.println("Logged in"); break;}                    // exits the loop
        }
        if (!(uName.equals("Cydeo")&& passW.equals("Cydeo123"))){          //after all three attempts, if the username
            System.err.println("Your account is locked.");                 //& password
        }
        }
        return;

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                    have three attempts to enter correct credentials and if all three attempts are failed,
                    then print "Your account is locked."
 */