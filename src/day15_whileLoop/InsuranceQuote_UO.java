package day15_whileLoop;
import java.util.Scanner;
public class InsuranceQuote_UO {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your gender");
        char gender=input.next().charAt(0);
        while (!(gender=='F'|| gender=='M')){
                System.err.println("Invalid gender, Re-enter your gender");
                gender=input.next().charAt(0);}
            System.out.println("Are you married(Yes/No)");
            String isMarried=input.next();
            while(!(isMarried.equals("Yes")||isMarried.equals("No"))){
                System.err.println("Invalid answer. Are you married? (Yes/No) ");
                isMarried=input.next();}
            System.out.println("Enter your age");
            int age =input.nextInt();
            while (!(age>0 &&age<=120)) {System.err.println("Invalid age. Re-enter your age.");
             age =input.nextInt();}
            System.out.println("Enter how many miles you drive in a day");
            int milage=input.nextInt();
            while (milage<5) {System.err.println("Invalid milage. Renter how many miles he/she drives in a day");
            milage=input.nextInt();}
            System.out.println("Do you want full coverage or liability insurance? FullCov/Liability");
            String type=input.next();
            while( !(type.equals("FullCov")||type.equals("Liability"))){
            System.err.println("Invalid Entry, please re-enter! full coverage or liability?");
            type = input.nextLine().toLowerCase();
        }
            System.out.println("Did you have any accidents or claims in past 5 years (Yes/No)");
            String accident=input.next();
            while(!(accident.equals("Yes")||accident.equals("No"))) {System.err.println("Invalid Entry Reenter if you have acc. or claims");
            accident=input.next();}
            System.out.println("Does you car have an anti-theft device (Yes/No)");
            String anti=input.next();
            while (!(anti.equals("Yes")||anti.equals("No"))) {System.err.println("Invalid Entry Reenter if you have acc. or claims");
            anti=input.next();}
            int price=0;
            if (type.equals("Liability")){
            if (age<25) price=90; else price=50;
            if (milage<=10)price+=10;
            else if (milage> 10 && milage <= 50) price+=10;
            else price+=50;}
            else{
                if (age<25) price=160; else price=120;
                if (milage<=10)price+=20;
                else if (milage> 10 && milage <= 50) price+=40;
                else price+=70;}

            if (anti.equals("Yes")){price-=.05*price;}
        if (accident.equals("Yes")){price+=.15*price;}
        if (accident.equals("No")){price-=.10*price;}
        if (isMarried.equals("Yes")){price-=.05*price;}

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + isMarried);
        System.out.println("Has Anti-Theft Device = " + anti);
        System.out.println("Had Accident Or Claims = " + accident);
        System.out.println("InsuranceType = " + type);
        System.out.println("Your insurance price is: "+price);

        input.close();
    }


        }


/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on th
 following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?
				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			Calculate the price of the insurance and display all the info of the user
				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50
						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50
					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120
						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70
				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */