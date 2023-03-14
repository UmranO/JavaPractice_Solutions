package day08_switch;

public class OxygenTank {
    public static void main(String[] args) {
        int level=95;
        String result="Invalid Number";        //precondition gercekleklesmezseyi burada verince asagida gerek kalmiyor
                                               //gecersizsew degismiyor. Gecerliyse de if st'a giriyor
        if (level>=0 && level<=100){
               result=(level > 90) ? "Your tank is full" : (level > 80) ? "Still okay"
                    : (level > 70) ? "Don't go too far" : (level > 60) ? "Start to head back"
                    : "Be careful now you at at 50%";
        }
        System.out.println(result);
    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
 and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -
                USE ONE PRINT STATEMENT ONLY
                Must use ternary
 */

//Yukardan baslamak daha mantikli