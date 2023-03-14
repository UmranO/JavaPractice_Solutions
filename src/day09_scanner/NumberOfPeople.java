package day09_scanner;
import java.util.Scanner;
public class NumberOfPeople {
    public static void main(String[] args) {
    String result="";
        System.out.println("How many people do you live with");
        int people=new Scanner(System.in).nextInt();
        if (people<3) result="Live with less than 3 people";
        else if(people>=3 && people<=6) result="Live with 3 - 6 peopl";
        else result="Live with more than 6 people";
        System.out.println(result);
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */