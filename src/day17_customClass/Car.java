package day17_customClass;

public class Car {
    public String make, model, color;
    public double price;
    public int year;

    public void setInfo(String make, String model, int year, String color, double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
    }

    public void start(){
        System.out.println(make+" is starting!");
    }

     public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    //----Test---------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Car car=new Car();
    car.setInfo("BMW","Coupe",2000,"Red",3.20);
    car.start();
    System.out.println(car);
}
}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price
		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()

 */