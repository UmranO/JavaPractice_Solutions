package day08_switch;

public class Calculator {
    public static void main(String[] args) {

        double n1 =100,
               n2 =200;
        char operator = '+';
        double result=0.0;

        switch(operator){
            case '-': result=n1-n2;
            break;
            case '+': result=n1+n2;
            break;
            case '*': result=n1*n2;
            break;
            case '/': result=n1/n2;
            default :
                System.out.println("Invalid operator");
        }
        System.out.println(result);

    }
}
