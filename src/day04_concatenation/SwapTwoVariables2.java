package day04_concatenation;

public class SwapTwoVariables2 {
    public static void main(String[] args) {

        double a = 10;
        double b = 15;


        a = a + b;
        b=a-b;                       //toplamdan mevbcut b'yi cikarinca yeni b'ye eski a'nin degerini veriyoruz
        a=a-b;                       //eski toplamdan yeni b'yi(yani eski a'yi) cikarinca eski b kalmis oluyor.
        System.out.println("a = "+a+"\nb = "+b);
    }
}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            a
            b
     Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              a = 10
              b = 15
        output:
                  a = 15
                  b = 20
 */