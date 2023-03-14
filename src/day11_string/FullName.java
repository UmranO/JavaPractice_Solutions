package day11_string;

import java.util.Locale;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
//----UO Way-----------------------------------------------------------------------------------------------------------
         String fName = "uMrAn",
                lName = "ozMaN";
        System.out.println(fName.toLowerCase().replaceFirst(fName.charAt(0)+"",(fName.charAt(0)+"").toUpperCase())
                +" "+ lName.toLowerCase().replaceFirst(lName.charAt(0)+"",(lName.charAt(0)+"").toUpperCase())  );

//----M Way------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String f = input.next().toLowerCase();

        f = ("" + f.charAt(0)).toUpperCase() + f.substring(1);

        System.out.println("Enter your last name:");
        String l = input.next().toLowerCase();
        l = (""+l.charAt(0)).toUpperCase() + l.substring(1);

        System.out.println(f + " " + l);

        input.close();
    }
}
/*
7. Write a program that asks user to enter first and last names, and then prints the full name in regular format
(first character in upper case)
        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";
        output:
        Cydeo School
        */