package day16_nestedLoop;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

    while(true){
        System.out.println("Enter the radius of the circle:");
        double r=input.nextDouble();

        if(r<0){System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0); }

        System.out.println("Diamer of the circle: "+r*2+
                         "\nArea of the circle is: "+3.14*r*2+
                         "\nPerimeter of circle is "+3.14*r*r);

        System.out.println("Would you like to calculate another circle?");
        String answer=input.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry for the radius. Reenter");
            answer=input.next();
        }
        if (answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator APP"); break;
        }
    }
    input.close();

    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error
                                message "Invalid Entry for the radius of the circle"
                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle
                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
                        Hint: you can use  System.exit(1) to terminate the entire program
 */
