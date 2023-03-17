package day15_whileLoop;
import java.util.Scanner;
public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next().toLowerCase();

        while( !(gender.equals("male")||gender.equals("female")) ){
            System.err.println("Invalid Entry, please re-enter your gender:");
            gender = input.next().toLowerCase();
        }

        System.out.println("Are you married?");
        String married = input.next().toLowerCase();

        while( !(married.equals("yes")||married.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Are you married?");
            married = input.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (age > 120 || age <0){
            System.err.println("Invalid Entry, please re-enter your age:");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();

        while(miles < 5){
            System.err.println("Invalid Entry, please re-enter mileage:");
            miles = input.nextInt();
        }

        input.nextLine();

        System.out.println("Would you like to have full coverage or liability insurance? (full coverage/liability)");
        String insuranceType = input.nextLine().toLowerCase();

        while( !(insuranceType.equals("full coverage")||insuranceType.equals("liability"))){
            System.err.println("Invalid Entry, please re-enter! full coverage or liability?");
            insuranceType = input.nextLine().toLowerCase();
        }

        System.out.println("Have you had any accidents or claims in past 5 years? (yes/no)");
        String hadAccidentOrClaims = input.next().toLowerCase();

        while( !(hadAccidentOrClaims.equals("yes")||hadAccidentOrClaims.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Have you had any accidents or claims in past 5 years?");
            hadAccidentOrClaims = input.next().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device?");
        String hasAntiTheftDevice = input.next().toLowerCase();

        while( !(hasAntiTheftDevice.equals("yes")||hasAntiTheftDevice.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Does your car have an anti-theft device?");
            hasAntiTheftDevice = input.next().toLowerCase();
        }

        double price = 0;

        // price calculation
        if(insuranceType.equals("liability")){
            if(age < 25){
                price += 90;
            }else{
                price += 50;
            }

            if(miles > 50){
                price += 50;
            }else if(miles > 10){
                price += 30;
            }else{
                price += 10;
            }

        }else{

            if(age < 25){
                price += 160;
            }else{
                price += 120;
            }

            if(miles > 50){
                price += 70;
            }else if(miles > 10){
                price += 40;
            }else{
                price += 20;
            }

        }


        double discountRate = 0;

        //discountRate calculation:

        if(hasAntiTheftDevice.equals("yes")){
            discountRate += 0.05;
        }

        if(hadAccidentOrClaims.equals("yes")){
            discountRate -= 0.15;
        }else{
            discountRate += 0.1;
        }

        if(married.equals("yes")){
            discountRate += 0.05;
        }

        double totalPrice = price * ( 1 - discountRate);

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + married);
        System.out.println("Has Anti-Theft Device = " + hasAntiTheftDevice);
        System.out.println("Had Accident Or Claims = " + hadAccidentOrClaims);
        System.out.println("InsuranceType = " + insuranceType);
        System.out.println("Your insurance price is: "+totalPrice);

        input.close();


    }

}

/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
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