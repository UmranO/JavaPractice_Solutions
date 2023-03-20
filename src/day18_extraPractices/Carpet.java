package day18_extraPractices;

public class Carpet {
    public double width, length,unitPrice;
    public boolean isPersian;

    public void setInfo(double width, double length,double unitPrice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }
    public double calcCost(){
         double totalPrice=width*length*unitPrice;
         if (isPersian) totalPrice+=200;
        return totalPrice;
    }

//----M Way--------------------------------------------------------------------

    public double calcCostM(){
    double total = width * length * unitPrice;
    return isPersian ? total+200 : total;                           //if isPersian return total+200 else return total
}
//------------------------------------------------------------------------------

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    //----Test---------------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Carpet carpet=new Carpet();
    carpet.setInfo(3.2,.5,1.0, false);
    System.out.println(carpet.calcCost());
    System.out.println(carpet);
}
}
/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian
            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet
                as calculated by calcCost()
		    total price of carpet = (width*length)*unitprice
		    if the carpet is persian  carpet, add 200$ to the totalPrice
 */