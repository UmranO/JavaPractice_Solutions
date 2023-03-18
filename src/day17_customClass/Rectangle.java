package day17_customClass;

public class Rectangle {
    public double length, width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        double area = length * width;
        return area;
    }
    public double perimeter(){
        double perimeter = 2*(length + width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    //----Test-------------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Rectangle rectangle=new Rectangle();
    rectangle.setInfo(3.0,2.0);
    System.out.println(rectangle.area());
    System.out.println(rectangle.perimeter());
    System.out.println(rectangle);
}
}
/*
create a custom class named Rectangle
		Attributes:
		    length, width
		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should diplay the length, width, area and perimeter of the Rectangle object
 */