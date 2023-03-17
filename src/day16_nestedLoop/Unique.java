package day16_nestedLoop;
public class Unique {
    public static void main(String[] args) {

        String str="aabccdeef";
        String unique="";                                   //bdf

        for (int j = 0; j < str.length(); j++) {

            int count=0;                                    //represents the frequency of the ch
            char ch=str.charAt(j);                          //each character of str

            for(int i=0; i<str.length(); i++){               //compares the character that outer loop picked, with each
                if(ch==str.charAt(i)){count++;}              //character of the string,
            }


//          if(count == 1){  result += ch;}         if the frequency of the character is 1, then the character is unique
//OR=>
             if(count!=1){continue;}
             unique+=ch;
        }
        System.out.println(unique);
    }

}



/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
                        Ex:  str = "aabccdeef";      output: bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for
             the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */

