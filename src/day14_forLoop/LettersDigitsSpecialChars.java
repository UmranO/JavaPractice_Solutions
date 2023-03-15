package day14_forLoop;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "mn@#123Ab !";
        String letters = "";
        String digits = "";
        String spChar = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') letters += ch;
            else if (ch >= '0' && ch <= '9') digits += ch;
            else {
                if (ch != ' ') {                        // Burada bosluk degilse special char dir diyoruz.
                    spChar += ch;
                }
            }
    }System.out.println("letters: " + letters + "  digits: " + digits + "  special chars: " + spChar);
    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:mn@#123Ab!        output:letters: mnAb  digits: 123   special chars: @#!





 */