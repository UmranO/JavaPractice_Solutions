package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the product name");
        String product=input.nextLine();
        System.out.println("enter the price");
        double price=input.nextDouble();
        System.out.println("enter the quantity");
        int quantity=input.nextInt();
        System.out.println("enter their first name");
        String fName=input.next();
        input.close();
        System.out.println(fName+", your order for "+quantity+" "+product+" has been placed. Your total is $"+quantity*price);
    }
}
/*
6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"
                    Output:
                        Luke, your order for 5 Apples has been placed. Your total is $7.5.
 */