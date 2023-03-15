package day14_forLoop;

public class SumOfDigits {
    public static void main(String[] args) {
        String input="A1B2C3";
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
        if(ch>='0' && ch<='9') sum+=ch-48;}  // eger bun char'lar 0 ile 9 arasindaysa 0's corresponding value in ASCII
        System.out.println(sum);             // Table is 48 9'un ki 57. 48-48=>0, 49-48=1, ...57-48=9 bu sekilde sayiya
                                             // cevirmis
    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */