package day18_extraPractices;

public class Contact {
    public String name, email;
    public int phoneNumber;

    public void setInfo(String name, int phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public void call(){
        System.out.println("Calling "+name+" now");
    }
    public void sendMessage(){
        System.out.println("Sending message to "+phoneNumber+" now");
    }
    public void sendEmail(){
        System.out.println("Sending email to "+email+" now");
    }


    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

//----Test-------------------------------------------------------------------------------------------------------------

public static void main(String[] args){
        Contact contact=new Contact();
        contact.setInfo("UO",3798715,"umo");
        contact.call();
        contact.sendMessage();
        contact.sendEmail();
    System.out.println(contact);
}
}
/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email
		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */
