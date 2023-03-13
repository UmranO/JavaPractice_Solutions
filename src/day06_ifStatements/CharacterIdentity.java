package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='z';
        String identity="";


        if (ch>=65 && ch<=90 || ch>=97 && ch <=122) identity="Alphabetic Character";
        else if(ch>=48 && ch<=57 ) identity="Digit";
        else identity="Special Character";
        System.out.println(identity);

        System.out.println("------------------------------");

        char ch1 = '@';
        boolean isDigit=ch>='0' && ch <= '9';
        boolean isLetter=(ch>='A' && ch<='Z' || ch>='a' && ch <='z');
        boolean isSpecialChar= !isDigit && !isLetter;

        String result = "";

        if(isDigit){
            result = "Digit";
        }
        if( isLetter  ){
            result = "Alphabetic";
        }
        if(isSpecialChar){
            result = "Special Character";
        }
        System.out.println(result);
    }
}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or
Alphabetic Character(A~Z or a~z) or a special character
		Ex:
			ch = '@'    output:Special Character
			ch = '1'    output:digit
		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
//Burada her char'in bir numeric oldugu icin direkt onunla kiyasladik, + boolean'de true oldugu durmu verdi