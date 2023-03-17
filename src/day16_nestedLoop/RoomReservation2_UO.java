package day16_nestedLoop;
import java.util.Scanner;
public class RoomReservation2_UO {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int total=0;
        while(true){
            System.out.println("Which bedroom do you want to reserve? \n " +
                    "\t\tKing    == $120\n" +
                    "\t\tQueen   == $100\n" +
                    "\t\tSingle  == $ 80");
            String room=input.next().toLowerCase();

            while (!(room.equals("king")||room.equals("queen")||room.equals("single"))){
                System.err.println("Invaild entry. Which bedroom do you want to reserve? King/Queen/Single");
                room=input.next().toLowerCase(); //to make sure user selected either king ,queen  or single
            }
            System.out.println("How many nights do you want to stay?");
            int nights=input.nextInt();

            while(nights<0){  System.err.println("Invalid entry. How many nights do you want to stay?");
            nights=input.nextInt();}                        //Burada cevabin while'in {}'inin icinde olmasina dikkat et!

            int price=room.equals("king")? 120 :room.equals("queen")? 100 : 80;
            int totalPriceForARoom=price*nights;
            total+=totalPriceForARoom;
            System.out.println("Your room type is : "+ room+"\nTotal price for the room is: "+totalPriceForARoom);

            System.out.println("Would you like to reserve another room? yes/no");
            String answer=input.next().toLowerCase();
            while(!(answer.equals("yes")|| answer.equals("no"))){System.err.println("Invaild entry. Would you like to " +
                    "reserve another room? yes/no");       // it stops if the answer is either ye or no
            answer=input.next().toLowerCase();}            //Burada cevabin while'in {}'inin icinde olmasina dikkat et!

           if (answer.equals("no")){System.out.println("Your total price is: "+total); break;}
        }
        input.close();
    }
}

/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
