package day06_ifStatements;

public class NetIncomeCalculator {
    public static void main(String[] args) {
//----UO Way-------------------------------------------------------------------------------------
        int salary=135;
        double taxRate=0.35;
        boolean isMarried=true;
        if (salary>=130 ){taxRate=.35;}
        if (salary>=100 && salary<=129 ){taxRate=.30;}
        if (salary>= 80 && salary<=99){taxRate=.25;}
        if (salary<=79 ){taxRate=.2;}

        double netIncome= (isMarried)? (salary-salary*(taxRate-.05)) : (salary-salary*taxRate);

        System.out.println(netIncome);
//----M Way-------------------------------------------------------------------------------------
        double salaryM= 135_000;
        boolean isMarriedM= false;

        double taxRateM= 0;

        if (salaryM>= 130000) { //false: salary < 130000;
            taxRateM= 0.35; //35%
        }
        if (salaryM< 130000 && salaryM>= 100000) { //false: salary < 100000;
            taxRateM= 0.30; //30%
        }
        if (salaryM< 100000 && salaryM>= 80000) { //false: salary < 80000
            taxRateM= 0.25; //25%
        }
        if (salaryM< 80000) {
            taxRateM= 0.20; //20%
        }
        if (isMarriedM) { // if the person is married
            taxRateM -= 0.05; // subtracting 5% from the original tax rate
        }
        double salaryAfterTax = salary - (salary * taxRate);           //* Cok guzel!!! If maried'se minus assign .05
        System.out.println("Salary After Tax = " + salaryAfterTax);

    }

}

/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following
requirements the tax rates are:
                        % for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less
                in addition, if the person is married, he/she will pay 5% less tax
 */