package day12_customMethods;

import java.util.Locale;

public class FullName {
//----UO Way--------------------------------------------------------------------------------------------------
    public static void capitalization(String fName, String lName){
        fName=(fName.charAt(0)+"").toUpperCase()+(fName.toLowerCase()).substring(1);
        lName=(lName.charAt(0)+"").toUpperCase()+(lName.toLowerCase()).substring(1);
        System.out.println(fName+" "+lName);
    }

//----Test----------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    capitalization("uMraN", "ozmaN");
}
}
/*
2. Create a method named capitalization that can format the first and last names of the person and display
  the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")
        output:
            full name: Cydeo School
 */