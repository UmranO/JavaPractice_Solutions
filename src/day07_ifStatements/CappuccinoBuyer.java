package day07_ifStatements;
public class CappuccinoBuyer {

    public static void main(String[] args) {
        String size="";
        String result="";
        boolean validSize=size.equals("tall") || size.equals("grande") ||size.equals("venti") || size.equals("thier");

   if (validSize){
       if(size.equals("tall")){result="price is $3.69\n90 calories";}
       else if(size.equals("grande")){result="price is $3.99\n120 calories";}
       else if(size.equals("venti")){result="price is $4.29\n150 calories";}
   }else{
       result="Invalid Size";
   }
        System.out.println(result);

    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price
and calories of cappuccino Valid sizes are tall, grande, venti and thier price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output shoud be "Invalid Size"
			Note: MUST use nested if
 */