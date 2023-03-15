package day14_forLoop;

public class Palindrome {
    public static void main(String[] args) {
        String input="elma";
        String reverse="";

        for (int i =input.length()-1 ; i>=0 ; i--) {
            reverse+=input.charAt(i);
        }
      boolean isPalindrome=input.equalsIgnoreCase(reverse); //buraya durumu yaziyorsun dogruysa true yanlissa false
        System.out.println(isPalindrome);                   //cikiyor. esit mi degilmi
    }

}
/*
Write a program that can check if the given String is palindrome
			Ex:
				input:Level   output:true
				input:Anna	  output:true

 */
