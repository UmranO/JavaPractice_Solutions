package day09_scanner;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        System.out.println("Enter the radius");
        double radius=new Scanner(System.in).nextDouble();                     //Scanner object'i double cevir
        double pi=3.14;

        System.out.println("Area : "+radius*radius*pi+"\nPerimeter : "+2*radius*pi);

    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */