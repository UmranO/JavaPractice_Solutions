package day07_ifStatements;

public class CrewAndPassenger {
    public static void main(String[] args){

        int total=75;
        String result="Invalid number";

   // boolean validNumber =  number == 50 || number == 75 || number ==100; -> M way asaginin ilk iki satiri alternatif
   //if(validNumber){ // number: 50, 75, 100                               -> M way


            if (total==50 || total==75 || total==100){
            if(total==50){result="20 crew, 30 passengers";}
            else if(total==75){result="25 crew, 50 passengers";}
            else {result="30 crew, 70 passengers";}

        }else{result="Invalid number";}
        System.out.println(result);
    }
}
/*
Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be
 crew members and how many can be passengers. Print how many of each type there should be.
            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */