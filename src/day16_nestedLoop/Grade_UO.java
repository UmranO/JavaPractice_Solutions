package day16_nestedLoop;
import java.util.Scanner;
public class Grade_UO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the side of the square:");
            double side = input.nextDouble();

            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            double area = side * side;
            double perimeter = side * 4;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = input.next().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo square calculator app!");
                break;
            }

        }


        input.close();

    }

}


