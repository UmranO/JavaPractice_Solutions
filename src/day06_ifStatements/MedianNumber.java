package day06_ifStatements;

public class MedianNumber {
    public static void main (String [] args){
        int a = 120, b = 30, c = 60;
        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median

//                            a=15,b=10,c=20    a=15,c=10,b=20
        boolean aIsMedian = ( a > b && a < c || a > c && a < b);

        //                    a=15,b=10,c=20    a=15,c=10, b=20
        boolean bIsMedian = ( b > a && b < c || b > c && b < a); //in order of b to be the median number:

        boolean cIsMedian =  !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a+" is the median number.");}
        if (bIsMedian){
            System.out.println(b+" is the median number.");
        }
        if (cIsMedian){
            System.out.println(c+" is the median number.");
        }
    }
}
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex: a = 10, b= 15, c = 20;     Output:15 is the median number
 */