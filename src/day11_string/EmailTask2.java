package day11_string;

public class EmailTask2 {
    public static void main(String[] args) {
        String input="craig_federighi@apple.com";
        String fName=input.substring(0,input.indexOf("_")).toLowerCase();
        fName=(fName.charAt(0)+"").toUpperCase()+fName.substring(1);        // +""yaptigin bolumu () icine al!

        String lName=input.substring(input.indexOf("_")+1,input.indexOf("@"));
        lName=(lName.charAt(0)+"").toUpperCase()+lName.substring(1);

        String domain=input.substring(input.indexOf("@")+1,input.lastIndexOf("."));
        System.out.println(" First name: "+fName+ "\n" +
                           " Last  name: "+lName+ "\n" +
                           " Domain    : "+domain);

    }
}
/*
9. Create a class called EmailTask2.
        Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that will print out information about user based on email. Print first name, last name, and domain.
        First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
        Ex:
        input:
        craig_federighi@apple.com
            Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
                    */
