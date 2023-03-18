package day17_customClass;
public class SalaryCalculator_UO {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;                    //parametre olarak aldiklarimizi instance field'lere set ediyoruz
        this.stateTaxRate=stateTaxRate/100;            //to make sure that user doesn't need to convert the % to decimal
        this.federalTaxRate=federalTaxRate/100;        //to make sure that user doesn't need to convert the % to decimal
        this.weeklyHours=weeklyHours;
    }
    public double salary(){
       return (hourlyRate * weeklyHours * 52);
    }
    public double stateTax(){
        return salary()*stateTaxRate;                                   //salary method'u veri olarak kullaniyoruz
    }
    public double federalTax(){                                      //UOS-instance'lari kullandigi icin parameteresiz
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHours +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
//----Test-------------------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    SalaryCalculator_UO sCal=new SalaryCalculator_UO();
    sCal.setInfo(30,20,10,5);        //direct arguments
    System.out.println(sCal);
    System.out.println(sCal.salary());
    System.out.println("-----ft");
    System.out.println(sCal.federalTax());
    System.out.println("-----st");
    System.out.println(sCal.stateTax());
    System.out.println("-----sat");
    System.out.println(sCal.salaryAfterTax());


}
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)
        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state Tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            it should display the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
