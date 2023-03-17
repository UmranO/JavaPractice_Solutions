package day15_whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//----UO Way------------------------------------------------------------------------------------------------------------
        System.out.println("Do you want to reserve a room?");
        String answer=input.next().toLowerCase();

        while (!(answer.equals("yes")|| answer.equals("no"))){             //Iki condition'i 1 ()'e koyup ! ile tersini
                                                                                      // yapmak lazim
            System.err.println ("Invalid answer enter a valid answer yes/no");
            answer=input.next().toLowerCase();
        }
        if (answer.equals("yes")){
            System.out.println("Which type of room  do you want to reserve? King/Queen/Single");
            answer=input.next().toLowerCase();
            switch (answer){
                case "king" :System.out.println("Your total will be = 120$");
                    break;
                case "queen":System.out.println("Your total will be = 100$");
                    break;
                case "single":System.out.println("Your total will be = 100$");
                    break;
            }
        }else{System.out.println("Have a nice day"); return;
        }

input.close();

    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to
   reserve a room.
 if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    	(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	     King Bed ==> 120$
	     Queen Bed ==> 100$
	     single Bed ==> 80$
         the program should be able to display the room he/she reserved and total price of the room.
         (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */