package day11_string;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
//----UO Way---------------------------------------------------------------------------------------------
        System.out.println("Enter a word");
        String word=new Scanner(System.in).next();

        if (word.startsWith("x")) word= word.replaceFirst("x","a");   //replace tumunu degistiriyor
        System.out.println(word);

//----M Way---------------------------------------------------------------------------------------------
        String str = "xcodex";
        if(str.charAt(0)=='x'){
            str=str.replaceFirst("x", "a");
        }


    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x,
replace it with a.
                    Input:xcodex        Output: acodex

 */