package day11_string;
import java.util.Scanner;
public class CombineTwoWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        System.out.println("Enter a word");
        String word1=scan.next();
        if(word.charAt(word.length()-1)==word1.charAt(0)) System.out.println(word+word1.substring(1));
        else System.out.println(word+word1);
        scan.close();
    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character
    once.
                   Input:                 Output:
                    one                   oneight
                    eight
 */