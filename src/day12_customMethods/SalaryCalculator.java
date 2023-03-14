package day12_customMethods;

public class SalaryCalculator {
    public static void calculateSalary(double hourlyRate, int weeklyHours){
        double salary = hourlyRate * weeklyHours * 52;

        System.out.println("You make $"+hourlyRate +" per hour" +
                          "\nYou work "+ weeklyHours+" hours per week" +
                          "\nYour gross income is $"+salary );
    }

//----Test----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        calculateSalary(12.0,3);
    }
}





/*
    Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)
    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)
        output:
            You make $45.0 per hour
            You work 40 hours per week
            Your gross income is $93600.0
     */