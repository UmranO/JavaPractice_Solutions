package day16_nestedLoop;

import java.util.Scanner;

public class SquareM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the side of a square");
        int side=input.nextInt();
        while (side<0){
            System.err.println("Invalid entry for side of a square");System.exit(0);}

        while(side>=0) {
            System.out.println("Area= " + side * side + "\nPerimeter= " + 4 * side);
            System.out.println("Do you want to repeat the previous steps? ");
            String answer = input.next();
           while(!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))){
                System.err.println("Invalid entry. Re-enter a valid entry");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the side of a square");
                side=input.nextInt();
            }else {System.out.println("Thank you for using Cydeo Square Calculator APP"); break;}

        }
        input.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error
                                message "Invalid Entry for the side of the square"
                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square
                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
                        Hint: you can use  System.exit(1) to terminate the entire program
 */