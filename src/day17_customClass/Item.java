package day17_customClass;
public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", total Price= $" + calcCost() +
                '}';
    }

    //----Test-----------------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Item item=new Item();
    item.setInfo("tomato", 3.2,1);
    System.out.println(item.toString());
    System.out.println(item.calcCost());
}

}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity
    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a Item object is passed in print statement,
            it should display the full information of the item object
 */