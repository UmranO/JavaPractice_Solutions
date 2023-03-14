package day11_string;
import java.util.Scanner;
public class WebAddress {
    public static void main(String[] args) {
//----UO Way------------------------------------------------------------------------------------------------------
        System.out.println("Enter a WebAdress");
        String wAdd = new Scanner(System.in).next();
        if (wAdd.startsWith("www.")&&(wAdd.endsWith(".com")||wAdd.endsWith(".edu")||wAdd.endsWith(".gov"))){
            System.out.println("Valid WebAdress");}
                    else{
                System.out.println("Invalid WebAdress");
            }
//----M Way------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------");

       String url = "www.amazon.com";
        boolean isValid = url.startsWith("www.") &&
                ( url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));

        if (isValid){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        }
    }

/*
1. Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */