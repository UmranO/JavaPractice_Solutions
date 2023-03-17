package day15_whileLoop;
import java.util.Scanner;
public class MarriageProposal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");
        String answer=input.next().toLowerCase();
        while (!(answer.equals("yes")|| answer.equals("no"))){
            System.err.println("Invalid answer, Will you marry me?");
            answer=input.next().toLowerCase();
        }
        System.out.println(answer.equals("yes")? "Congrats" :"Goodby");
        input.close();
        return;
    }
}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters
    either yes or no
 */
