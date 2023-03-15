package day15_whileLoop;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int neg=0, pos=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num=input.nextInt();
            if (num>0){pos++;}
            else if (num<0){neg++;}                                                 //Galiba else zorunlu degil check
        }
        System.out.println(pos+" positive and "+neg+" negative");
        input.close();
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user
entered
			Ex: Inputs:10, 20, -1, 0, 3
				Output:3 positive and 1 negative
				*/
