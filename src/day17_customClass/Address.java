package day17_customClass;
public class Address {
    public int buildingNumber;
    public String street, city, state, zipCode;

    public void setInfo(int buildingNumber, String street, String city, String state, String zipCode){
    this.buildingNumber=buildingNumber;
    this.street=street;
    this.city=city;
    this.state=state;
    this.zipCode=zipCode;
    }


    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    //----Test--------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Address adress=new Address();
    adress.setInfo(7925,"Jones Branch Dr","McLean","Va","22012");
    System.out.println(adress);
}
}
/*
Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */