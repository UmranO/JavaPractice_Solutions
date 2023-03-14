package day11_string;

public class EmailTask1 {
    public static void main(String[] args) {
        String input="mike_tyson@gmail.com";
        String fName=input.substring(0,input.indexOf("_"));
        String lName=input.substring(input.indexOf("_")+1,input.indexOf("@"));
        String rest=input.substring(input.indexOf("@"));
        if (input.contains("_")){
            input=lName+"_"+fName+rest;
        }
        System.out.println(input);


    }
    }
   /* 8. Create a class calledEmailTask1.
    Assume that email address is constructed by person's first name and followed by an underscore and last name.
    Write a program that can swap first name with last name in the email (Saperated by an underscore).
    If the email doesn't contain an underscore print the given input email.
    Ex:
    input: mike_tyson@gmail.com
    output: tyson_mike@gmail.com
 */

