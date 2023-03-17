package day16_nestedLoop;

public class Shape {
    public static void main(String[] args) {
        String star = "";

        for (int j = 1; j < 11; j++) {        //Disardaki dikey

            for (int i = 0; i < j; i++) {    //Icerdeki yatay ilk seferinde j=1 so i can repeat only once, ikinci turda
                System.out.print("* ");      //j=2 so i can repeat 2 kere yani(i=0 ve i=1) Kritik olan i<j
            }

            System.out.println();
        }
    }
}

/*
1. Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */