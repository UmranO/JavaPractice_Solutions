package day14_forLoop;

public class FactorialNumber {
    public static void main(String[] args) {
        double n=5.0;
        int factorial=1;
        for (int i = (int)n; i >=1; i--) {    //Burada downCast double to int yapiyoruz for( 'da n'den once
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
/*
4. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
